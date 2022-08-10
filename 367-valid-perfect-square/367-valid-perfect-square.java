class Solution {
    public boolean isPerfectSquare(int num) {
        int start = 1;
        int end = num;
        
        if(num==0)
            return false;
        
        while(start<=end){
            int mid = start + (end-start)/2;
            
            if(mid*mid== num) 
                return true;
            else if(mid>num/mid)
                end = mid-1;
            else
                start = start + 1;
        }
        return false;
    }
}