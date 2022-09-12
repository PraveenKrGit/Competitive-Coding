class Solution {
    public int maxProduct(int[] nums) {
        
        int max = nums[0], min = nums[0], result=nums[0];
        
        for(int i=1;i<nums.length;i++){
            int temp = max;
            
            //neg*neg could be positive so we have to maintain min
            //if next neg come, neg*neg could be bigger
            
            max = Math.max(Math.max(max*nums[i], min*nums[i]), nums[i]);
            
            min = Math.min(Math.min(temp*nums[i], min*nums[i]), nums[i]);
            
            if(max>result){
                result = max;
            }
        }
        
        return result;
    }
}