package LVC_08;


import java.util.*;
class DPFibonacciMemo{
static int f(int n, int[] dp){
    if(n<=1) return n;
    
    if(dp[n]!= -1) return dp[n];
    return dp[n]= f(n-1,dp) + f(n-2,dp);
}


public static void main(String args[]) {

  int n=6;
  int dp[]=new int[n+1];
  //Initialization done with -1
  Arrays.fill(dp,-1);
  System.out.println(f(n,dp));
  
}
}
