class Solution {
    public int countVowelStrings(int n) {
//         int a=1, e=1, i=1, o=1, u=1;
//         while(n-->1){
//             a= a+e+i+o+u;
//             e= e+i+o+u;
//             i= i+o+u;
//             o= o+u;
//             u= u;
//         }
        
//         return a+e+i+o+u;
//     }
        
            int[] dp = new int[6];
            for(int i=1;i<dp.length;i++){
                dp[i]=1;
            }
        
        for(int i=1;i<=n;i++){
            for(int k=1;k<=5;k++){
                dp[k] += dp[k-1];
            }
            
            
        }
        return dp[5];
    }
}