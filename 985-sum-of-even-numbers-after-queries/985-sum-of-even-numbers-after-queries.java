class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        
        //brute force causes TLE
        
        int n= queries.length;
        int sum =0;
        int[] res = new int[nums.length];
        
        //first we add all even no. of nums array
        
        for(int num: nums){
            if(num%2==0)
                sum+=num;
        }
        
        for(int i=0;i<n;i++){
            
            int val = queries[i][0];
            int index = queries[i][1];
            
            //if no. at that index in nums is even then we deduct
            //that no. from sum so that we can add val to that no later
            //and then calculate sum and if that no is even then add that to res
            
            if(nums[index]%2==0)
                sum -=nums[index];
            
            nums[index] += val;
            
            if(nums[index]%2==0)
                sum +=nums[index];
            
            res[i] = sum;
            
        }
        
        return res;
    }
}


// Time limit exceeded solution
// class Solution {
//     public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
//         List<Integer> list  = new ArrayList<>();
        
//         int n= queries.length;
//         int sum =0;
//         int[] res = new int[nums.length];
        
        
//         for(int i=0;i<n;i++){
//             int s=0;
//             int val = queries[i][0];
//             int index = queries[i][1];
//             sum = nums[index] + val;
//             nums[index] = sum;
//             for(int j=0;j<nums.length;j++){
//                 if(nums[j]%2==0)
//                     s +=nums[j];
//             }
//             res[i] = s;
            
//             //nums[i] = nums[i] + queries[i][]
//         }
        
//         return res;
//     }
// }