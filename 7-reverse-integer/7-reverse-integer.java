class Solution {
    public int reverse(int x) {
        int res =0;
        while(x!=0){
            int pop = x%10;
            int temp = res * 10 + pop;
            
            if((temp-pop)/10 != res)
                return 0;
            
            res = temp;
            x /=10;
        }
        
        return res;
    }
}