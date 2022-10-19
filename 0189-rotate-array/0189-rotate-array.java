class Solution {
    public void rotate(int[] nums, int k) {
        //The basic idea is that, for example, nums = [1,2,3,4,5,6,7] and k = 3, 
        //first we reverse [1,2,3,4], it becomes[4,3,2,1]; then we reverse[5,6,7], 
        //it becomes[7,6,5], finally we reverse the array as a whole, 
        //it becomes[4,3,2,1,7,6,5] ---> [5,6,7,1,2,3,4].
        
        if(nums== null || nums.length<2){
            return;
        }
        k = k%nums.length;
        reverseNum(nums, 0, nums.length-k-1);
        reverseNum(nums, nums.length-k, nums.length-1);
        reverseNum(nums, 0, nums.length-1);
        
    }
    
    
    public void reverseNum(int[] nums, int start, int end){
        int temp = 0;
        while(start<end){
            temp=nums[start];
            nums[start]= nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}