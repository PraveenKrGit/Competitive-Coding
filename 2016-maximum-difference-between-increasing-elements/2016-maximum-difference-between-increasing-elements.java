class Solution {
    public int maximumDifference(int[] nums) {
        int least = Integer.MAX_VALUE;
        int temp=0;
        int lar=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]<least){
                least = nums[i];
            }
            
            temp=nums[i]-least;
            
            if(lar<temp){
                lar=temp;
            }
        }
        
        if(lar>0)
            return lar;
        else
            return -1;
    }
}