class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        
        HashSet<Integer> res = new HashSet<>();
        
        for(int i=0;i<nums.length;i++){
            if(i!=nums[i]){
                return i;
            }
            
        }
        return nums.length;
    }
}