package LVC_05;

import java.util.ArrayList;
import java.util.Arrays;

public class Min_Coins {
	  public static void main(String[] args) {

		    int V = 55586;
		    ArrayList < Integer > ans = new ArrayList < > ();
		    int coins[] = {100, 2, 5, 10, 20, 50, 1, 500, 1000};
		   Arrays.sort(coins);
		    int n = coins.length;
		    for (int i = n - 1; i >= 0; i--) {
		      while (V >= coins[i]) {
		        V -= coins[i];
		        ans.add(coins[i]);
		      }
		    }
		    System.out.println("The minimum number of coins is "+ans.size());
		    System.out.println("The coins are ");
		    for (int i = 0; i < ans.size(); i++) {
		      System.out.print(" " + ans.get(i));
		    }

		  }
}
