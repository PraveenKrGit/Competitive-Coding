class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int max=0;
        int n= nums.length;
        int count = max;
        
        for(int i=0;i<n;i++){
                if(i==0 || nums[i-1]< nums[i]){
                    count++;
                }
                else
                    count =1;
            max  = Math.max(max, count);
        }
        return max;
    }
}