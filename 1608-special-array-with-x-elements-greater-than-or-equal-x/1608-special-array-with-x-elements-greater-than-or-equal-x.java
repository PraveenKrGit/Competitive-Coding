class Solution {
    public int specialArray(int[] nums) {
        int[] count = new int[1001];
        
        for(int ele: nums){
            count[ele]++;
        }
        
        int res =0;
        int x = nums.length;
        
        for(int i=0;i<=100;i++){
            if(x==i)
                return i;
            
            x -=count[i];
        }
        
        return -1;
    }
}