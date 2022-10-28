class Solution {
    public int search(int[] nums, int target) {
        //Using binary search to reduce time complexity from O(n) to O(log n)
        int left=0;
        int right = nums.length-1;
        
        while(left<=right){
            int mid = (left+right)/2;
            
            if(nums[mid]==target)
                return mid;
            
            //middle value is in left portion
            if(nums[left]<=nums[mid]){
                if(target>=nums[left] && target< nums[mid])
                    right = mid-1;
                else
                    left = mid+1;
            }//middle value is in right portion
            else{
                if(target>nums[mid] && target<=nums[right])
                    left=mid+1;
                else
                    right=mid-1;
            }
        }
        
        // return nums[left]==target? left:-1;
        return -1;
    }
}