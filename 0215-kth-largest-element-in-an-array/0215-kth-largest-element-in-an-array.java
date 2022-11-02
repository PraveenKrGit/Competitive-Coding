class Solution {
    public int findKthLargest(int[] nums, int k) {
//         PriorityQueue<Integer> queue = new PriorityQueue<>();
        
//         for(int i=0;i<nums.length;i++){
//             queue.add(nums[i]);
//         }
        
//         // Iterator<Integer> i = new Iterator<>();
        
//         System.out.println(queue);
        
//         return 0;
        
        
        Arrays.sort(nums);
        int len = nums.length;
        return nums[len-k];
    }
}