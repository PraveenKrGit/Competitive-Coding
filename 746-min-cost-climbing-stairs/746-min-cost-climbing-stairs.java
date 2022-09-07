class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        int n= cost.length;
        int[] dp = new int[n+1];
        
        dp[0] = cost[0];
        dp[1] = cost[1];
        
        for(int i=2;i<=n;i++){
            //start from index 2 and add min btw prev 2 values 
            //if i=n ie reached to top beyond last step so add 0 and return dp[n]
            dp[i]= Math.min(dp[i-1], dp[i-2]) + (i==n ? 0 : cost[i]);
        }
        
        return dp[n];
        
    }
}