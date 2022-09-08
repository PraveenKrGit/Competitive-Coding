class Solution {
    public int minFallingPathSum(int[][] grid) {
        int n = grid.length;
        
        int[][] dp = new int[n][n];
        
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        //for same adjacent row and same column
        int sameIndex = -1;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dp[i][j] = Integer.MAX_VALUE;
                if(i==0){
                    dp[i][j] = grid[i][j];
                }else{
                    if(j==sameIndex){
                        dp[i][j] = Math.min(min2+grid[i][j], dp[i][j]);
                    }else{
                        dp[i][j] = Math.min(min+grid[i][j], dp[i][j]);
                    }
                }
            }
            min = Integer.MAX_VALUE;
            min2 = Integer.MAX_VALUE;
            sameIndex = -1;
            
            for(int j=0;j<n;j++){
                if(min>= dp[i][j]){
                    min2 = min;
                    min = dp[i][j];
                    sameIndex = j;
                    
                }else if(min2>dp[i][j]){
                    min2 = dp[i][j];
                }
            }
            
        }
        
        return min;
    }
}