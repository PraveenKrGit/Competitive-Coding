class Solution {
    public String longestPalindrome(String s) {
        
        int maxLen = 0;
        String str = "";
        
        //expand from middle
        //expand through that character and go left and right 
        
        
        for(int i=0;i<s.length();i++){
            
            //for odd length palindrome
            int left= i, right =i;
            while(left>=0 && right<s.length() && (s.charAt(left)==s.charAt(right))){
                    if((right-left+1) >maxLen){
                        str = s.substring(left, right+1);
                        maxLen=right-left+1;
                    }  
                
                left--;
                right++;
            }
            
            //for even length palindrome
            left=i;
            right=i+1;
            while(left>=0 && right<s.length() && (s.charAt(left) == s.charAt(right))){
                    if((right-left+1)> maxLen){
                        str = s.substring(left, right+1);
                        maxLen= right-left+1;
                    }    
                
                left--;
                right++;
            }
        }
        
        return str;
    }
}