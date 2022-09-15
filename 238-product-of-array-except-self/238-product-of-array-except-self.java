class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        
        int left = 1;
        int right = 1;
        
        answer[0] = left;
        //products of nums in the left of current index
        for(int i=1;i<nums.length;i++)
            answer[i] = answer[i-1]*nums[i-1];
        
        //products of nums in the right of current index
        for(int i=nums.length-1;i>=0;i--){
            answer[i] *=right;
            right *= nums[i];
        }
        
        return answer;
    }
}