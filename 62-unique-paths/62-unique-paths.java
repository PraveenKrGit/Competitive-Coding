class Solution {
    public int uniquePaths(int m, int n) {
        
        if(m==0||n==0)
            throw new IllegalArgumentException("Illegal hai bhai");
        
        int[][] dp = new int[m][n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j] = -1;
            }
        }
        
        return path(m-1, n-1, dp);
        
        
    }
    
    private int path(int i, int j, int[][] dp){
        if(i==0 || j==0)
            return 1;
        
        if(dp[i-1][j]==-1)
            dp[i-1][j] = path(i-1, j, dp);
        
        if(dp[i][j-1]==-1)
            dp[i][j-1] = path(i, j-1, dp);
        
        return dp[i-1][j] + dp[i][j-1];
    }
}