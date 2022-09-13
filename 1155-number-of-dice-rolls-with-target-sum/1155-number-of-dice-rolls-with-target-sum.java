class Solution {
    public int numRollsToTarget(int n, int k, int target) {
        int MOD = 1000000000 + 7;
        
        int[][] dp = new int[n+1][target+1];
        
        dp[0][0] = 1;
        
        for(int i=1;i<=n;i++){
            for(int j=0;j<=target;j++){
                for(int f=1;f<=k;f++){
                    if(j>=f){
                        dp[i][j]= (dp[i][j]+dp[i-1][j-f])%MOD;
                        
                        //curr = curr+prev;
                    }
                }
            }
        }
        
        return (int)dp[n][target];
    }
}


// MEMOIz DFS

// class Solution {
//     //int mod = 1000000000 + 7;
    
//     int MOD = (int)Math.pow(10, 9) + 7;
//     Map<String, Integer> map = new HashMap<>();
    
//     public int numRollsToTarget(int n, int k, int target) {
        
//         if(n==0 && target==0)
//             return 1;
        
//         if(n==0 || target==0)
//             return 0;
        
//          // if(n > target || n * k < target)
//          //    return 0;
         
//         String str = n + " " + target;
        
//         if(map.containsKey(str))
//             return map.get(str);
        
//         int res = 0;
//         for(int i=1;i<=k;i++)
//             if(target>=i)
//                 res = (res+ numRollsToTarget(n-1, k, target-1)) % MOD;
//             else
//                 break;
        
        
//         map.put(str, res);
//         return res;
        
//     }
// }



//explanation: In other words, what is dp(5, 6, 18)?

// At first glance, this is seems difficult and overwhelming. But if we make one simple observation, we can reduce this big problem into several smaller sub-problems. We have 5 dice, but let's first just look at ONE of these dice (say the last one). This die can take on f=6 different values (1 to 6), so we consider what happens when we fix its value to each possibility (6 cases):

// Case 1: The last die is a 1. The remaining 4 dice must sum to 18-1=17. This can happen dp(4, 6, 17) ways.
// Case 2: The last die is a 2. The remaining 4 dice must sum to 18-2=16. This can happen dp(4, 6, 16) ways.
// Case 3: The last die is a 3. The remaining 4 dice must sum to 18-3=15. This can happen dp(4, 6, 15) ways.
// Case 4: The last die is a 4. The remaining 4 dice must sum to 18-4=14. This can happen dp(4, 6, 14) ways.
// Case 5: The last die is a 5. The remaining 4 dice must sum to 18-5=13. This can happen dp(4, 6, 13) ways.
// Case 6: The last die is a 6. The remaining 4 dice must sum to 18-6=12. This can happen dp(4, 6, 12) ways.

// dp(5, 6, 18) = dp(4, 6, 17) + dp(4, 6, 16) + dp(4, 6, 15) + dp(4, 6, 14) + dp(4, 6, 13) + dp(4, 6, 12)

// We sum up the solutions these 6 cases to arrive at our result. Of course, each of these cases branches off into 6 cases of its own, and the recursion only resolves when d=0. The handling of this base case is explained below.