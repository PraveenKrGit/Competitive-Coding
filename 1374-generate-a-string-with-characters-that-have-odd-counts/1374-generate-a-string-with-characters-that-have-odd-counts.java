class Solution {
    public String generateTheString(int n) {
        char[] res = new char[n];
        
        Arrays.fill(res, 'p');
        
        if(n%2==0){
            res[0]='a';
        }
        
        return new String(res);
    }
    
}