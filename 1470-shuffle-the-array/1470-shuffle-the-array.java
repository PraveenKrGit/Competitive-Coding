class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[2*n];
        for(int i=0, j=n, index=0;index<res.length;i++,j++){
            res[index++] = nums[i];
            res[index++] = nums[j];
        }
        return res;
    }
}