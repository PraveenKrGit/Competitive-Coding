class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
            return 0;
        Arrays.sort(nums);
        
        int max=1;
        int k=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1]+1 ){
                k++;
            }   
            else if(nums[i] != nums[i-1]+1 && nums[i-1] != nums[i])
                k=1;
            else
                k=k;
            
            if(max<k)
                max=k;
        }
        return max;
    }
}