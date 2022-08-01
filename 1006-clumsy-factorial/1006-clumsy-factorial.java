class Solution {
    public int clumsy(int n) {
        if(n==1)
            return 1;
        
        if(n==2)
            return 2*1;
        
        if(n==3)
            return 3*2/1;
        
        return n *(n-1)/(n-2)+Helper(n-3);
    }
    
    private int Helper(int M){
        if(M==1)
            return 1;
        
        if(M==2)
            return 2-1;
        if(M==3)
            return 3-2*1;
        
        if(M==4)
            return 4-3*2/1;
        
        return M-(M-1)*(M-2)/(M-3)+Helper(M-4);
    }
}