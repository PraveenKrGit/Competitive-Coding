class Solution {
    public double myPow(double x, int n) {
        if(n==0)
            return 1;
        if(x==1)
            return 1;
        
        if(x==-1){
            if(n%2==0)
                return 1;
            else
                return -1;
        }
        
        if(n == Integer.MIN_VALUE)
            return 0;
        
        if(n<0){
            x=1/x;
            n= -n;
        }
        
        double ans = 1;
    while(n>0){
        if((n&1) != 0) ans *= x;
        x *= x;
        n >>= 1;
    }
    return ans;
            
    }
}