class Solution {
    public String reversePrefix(String word, char ch) {
        char[] c = word.toCharArray();
        int locate = 0;
        
        for(int i=0;i< word.length();i++){
            if(c[i]==ch){
                locate = i;
                break;
            }
        }
        
        char[] res = new char[word.length()];
        
        for(int i= 0;i<=locate;i++){
            res[i]= c[locate-i];
        }
        
        for(int i=locate+1;i<word.length();i++){
            res[i]= c[i];
        }
        
        return String.valueOf(res);
    }
}