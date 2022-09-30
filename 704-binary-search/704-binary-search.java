class Solution {
    public int search(int[] nums, int target) {
        //classic binary search
        //iterative
        int low =0;
        int high = nums.length-1;
        
        while(low<=high){
            int mid = (low+high)/2;
            
            if(nums[mid]==target)
                return mid;
            else if(target<nums[mid])
                high= mid-1;
            else if(target>nums[mid])
                low = mid+1;
        }
        return -1;
        
//         Time Complexity :- BigO(logN)
//          Space Complexity :- BigO(1)
    }
}