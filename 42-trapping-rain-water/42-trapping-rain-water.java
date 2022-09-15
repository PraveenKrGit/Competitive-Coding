class Solution {
    public int trap(int[] height) {
        int n= height.length;
        
        int[] leftMax = new int[n];
        int[] rightMax= new int[n];
        
        //create arrays of max height from left and right respectively
        //[0,1,1,2,2,2,2,3,3,3,3...]
        leftMax[0] = height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i], leftMax[i-1]);
        }
        
        //[...3,3,3,3,2,2,1]
        rightMax[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(height[i], rightMax[i+1]);
        }
        
        //compare first value of leftmax and rightmax to get waterlevel
        //waterlevel-height[i] : it shows how much water it can hold in that height
        //add all that water to get netwater
        int netwater=0, waterlevel=0;
        for(int i=0;i<n;i++){
            waterlevel = Math.min(leftMax[i], rightMax[i]);
            netwater +=(waterlevel-height[i]);
        }
        
        return netwater;
    }
}