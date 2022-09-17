class Solution {
    public int countSubstrings(String s) {
        
        int count=0;
        
        //same as longest palindromic substring
        
        //expand from middle
        //expand through that character and go left and right and count
        
        
        for(int i=0;i<s.length();i++){
            
            //for odd length palindrome
            int left= i, right =i;
            while(left>=0 && right<s.length() && (s.charAt(left)==s.charAt(right))){
                    count ++;  
                
                left--;
                right++;
            }
            
            //for even length palindrome
            left=i;
            right=i+1;
            while(left>=0 && right<s.length() && (s.charAt(left) == s.charAt(right))){
                    count++;   
                
                left--;
                right++;
            }
        }
        
        return count;
    }
}