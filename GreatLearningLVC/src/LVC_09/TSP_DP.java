package LVC_09;

public class TSP_DP {



   static int totalCost(int mask, int pos, int n,int[][] cost,int [][]dp) {
     
     // Base case: if all cities are visited, return the
     // cost to return to the starting city (0)
     if (mask == (1 << n) - 1) {
         return cost[pos][0];
     }
     if(dp[mask][pos]!=-1) {
    	 return dp[mask][pos];
     }
     int ans = Integer.MAX_VALUE;

     // Try visiting every city that has not been visited
     // yet
     for (int i = 0; i < n; i++) {
         if ((mask & (1 << i)) == 0) {
           
             // If city i is not visited, visit it and
             // update the mask
             ans = Math.min(
                 ans, cost[pos][i]
                          + totalCost(mask | (1 << i), i,
                                      n, cost,dp));
         }
     }

     return dp[mask][pos]=ans;
 }

   static int tsp(int[][] cost,int [][]dp) {
     int n = cost.length;
     
   // Start from city 0, and only city 0 is
   // visited initially (mask = 1)
     return totalCost(1, 0, n,cost,dp);  
 }

 public static void main(String[] args) {
	 int n=4;
	 int dp[][]=new int [16][4];
	 for(int i=0;i<(1<<n);i++)
		 for(int j=0;j<n;j++)
			 dp[i][j]=-1;
     
     int[][] cost = { { 0, 10, 15, 20 },
                      { 10, 0, 35, 25 },
                      { 15, 35, 0, 30 },
                      { 20, 25, 30, 0 } };
   
     int res = tsp(cost,dp);

     System.out.println(res);
 }
}