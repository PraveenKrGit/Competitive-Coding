class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        
        //getting size i.e. no. of lists inside the list
        int n = triangle.size();
        
        int[][] dp = new int[n+1][n+1];
        
        //starting from the bottom list
        for(int level = n-1; level>=0;level--){
            for(int i=0;i<=level;i++){
                
                //compares two adjacent of prev list and add current val + prev min val between two adjacent cell
                
                dp[level][i] = triangle.get(level).get(i)+ Math.min(dp[level+1][i], dp[level+1][i+1]);
                
            }
        }
        
        
        //return the min sum which we got at top of the dp array
        return dp[0][0];
    }
}