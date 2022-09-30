class Solution {
    public int nthUglyNumber(int n) {
        if(n<=0)
            return 0;
        
        //three index pointers pointing to different positions of the array.
        int a=0, b=0, c=0;
        
        int[] dp = new int[n];
        
        dp[0] = 1;
        
        for(int i=1;i<n;i++){
            dp[i] = Math.min(dp[a]*2, Math.min(dp[b]*3, dp[c]*5));
            
            //when t[3]*2==6 and t[2]*3==6 are handled by the 3 consecutive 
            //ifs incrementing both a and b in the same iteration.
            if(dp[i]== dp[a]*2)
                a++;
            if(dp[i]== dp[b]*3)
                b++;
            if(dp[i]==dp[c]*5)
                c++;
        }
        
        return dp[n-1];
        
    }
}