class Solution {
    public int sumOfUnique(int[] nums) {
        int[] count = new int[101];
        
        int sum = 0;
        for(int n : nums){
            count[n]++;
            
            if(count[n]==1)
                sum +=n;
            if(count[n]==2)
                sum -= n;
        }
        return sum;
    }
}