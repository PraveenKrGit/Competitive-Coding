class Solution {
    public boolean increasingTriplet(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MAX_VALUE;
        
        for( int n : nums){
            if(n<=min)
                min = n;
            else if(n<= max)
                max = n;
            else
                return true;
        }
        return false;
    }
}