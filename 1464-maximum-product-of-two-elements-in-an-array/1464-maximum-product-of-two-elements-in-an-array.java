class Solution {
    public int maxProduct(int[] nums) {
        int max = 0;
        int min = 0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                min= max;
                max = nums[i];
            }
            else if (nums[i]>=min)
                min=nums[i];
        }
        return ((max-1)*(min-1));
    }
}