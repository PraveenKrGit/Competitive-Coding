class Solution {
    public int divisorSubstrings(int num, int k) {
        
        //sliding window problem
        //convert to string
        //slide through string using substring (i,i+k)
        
        String str = String.valueOf(num);
        int res = 0;
        
        for(int i=0;i<str.length()-k+1;i++){
            String sub = str.substring(i,i+k);
            int n = Integer.valueOf(sub);
            if(n==0)
                continue;
            if(num%n==0)
                res++;
        }
        
        return res;
    }
}