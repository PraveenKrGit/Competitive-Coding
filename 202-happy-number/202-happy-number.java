class Solution {
    
    private int getNewNum(int n){
        int sum =0;
        while(n>0){
            int d = n%10;
            n = n/10;
            sum +=d*d;
        }
        
        return sum;
    }
    
    public boolean isHappy(int n) {
        Set<Integer> list = new HashSet<>();
        
        while (n !=1 && !list.contains(n)){
            list.add(n);
            n= getNewNum(n);
        }
        
        return n==1;
    }
}