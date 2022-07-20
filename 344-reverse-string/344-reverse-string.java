class Solution {
    public void reverseString(char[] res) {
        
        
        int i=0;
        int j=res.length-1;
        while(i<j){
            char temp = res[i];
            res[i]= res[j];
            res[j] = temp;
            i++;
            j--;
        }
    }
}