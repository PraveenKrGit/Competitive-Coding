class Solution {
    public int coinChange(int[] coins, int amount) {
        
        
        int[] dp = new int[amount+1];
        
        Arrays.fill(dp, amount+1);
        dp[0] = 0;
        
        for(int i=1;i<=amount;i++){
            for(int j=0;j<coins.length;j++){
                if(coins[j]<= i){
                    
                    //dp[i] means no. of coins for amount i;
                    //we go go from amount 0 to amount+1
                    //dp[i-coins[j]]+1 means
                    //if i= 7 and coins at j = 4
                    //then for 4 = 1 coin and 7-4=3
                    //for dp[3] == how many coins for amt 3 which is already calculated
                    //so dp[3] + 1 for total coin
                    dp[i] = Math.min(dp[i], dp[i-coins[j]]+1);
                }
            }
        }
        
        return dp[amount] == amount +1? -1  : dp[amount];
    }
}