class Solution {
    public boolean judgeSquareSum(int c) {
        long start =0;
        long end = (long) Math.sqrt(c);
        
        while(start<=end){
            long res = start*start + end*end;
            if(res<c)
                start++;
            
            else if(res>c)
                end--;
            
            else
                return true;
        }
        return false;
    }
}