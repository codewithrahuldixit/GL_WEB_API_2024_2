package LVC_05;

import java.io.IOException;
import java.util.Arrays;

class Job {
	   int id, profit, deadline;
	   Job(int x, int y, int z) {
	      this.id = x;
	      this.deadline = y;
	      this.profit = z;
	   }
	}

	class solve {
	   // return an array of size 2 having the 0th element equal to the count
	   // and 1st element equal to the maximum profit
	   int[] JobScheduling(Job arr[], int n) {
	      Arrays.sort(arr, (a, b) -> (b.profit - a.profit));
	      int maxi = 0;
	      for (int i = 0; i < n; i++) {
	         if (arr[i].deadline > maxi) {
	            maxi = arr[i].deadline;
	         }
	      }

	      int result[] = new int[maxi + 1];

	      for (int i = 1; i <= maxi; i++) {
	         result[i] = -1;
	      }

	      int countJobs = 0, jobProfit = 0;

	      //No of Task
	      for (int i = 0; i < n; i++) {
	    	  //to fill the slot from backword
	         for (int j = arr[i].deadline; j > 0; j--) {

	            // Free slot found 
	            if (result[j] == -1) {
	               result[j] = i;
	               countJobs++;
	               jobProfit += arr[i].profit;
	               break;
	            }
	         }
	      }

	      int ans[] = new int[2];
	      ans[0] = countJobs;
	      ans[1] = jobProfit;
	      return ans;

	   }
	}
	class Job_Sequencing {
	   public static void main(String[] args) throws IOException {

	      //size of array
	      Job[] arr = new Job[5];
	      arr[0] = new Job(1, 2, 100);
	      arr[1] = new Job(2, 2, 27);
	      arr[2] = new Job(3, 1, 25);
	      arr[3] = new Job(4, 1, 19);
	      arr[4] = new Job(5, 3, 15);

	      solve ob = new solve();

	      //function call
	      int[] res = ob.JobScheduling(arr, 5);
	      System.out.println(res[0] + " " + res[1]);

	   }
	}