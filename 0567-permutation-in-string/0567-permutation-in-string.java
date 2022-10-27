class Solution {
    public boolean checkInclusion(String s1, String s2) {
        //count freq of char of s1
        //count freq of those char of s2 that is in s1
        //match s1freq and s2freq
        
        //eg . ab and eidbaooo => true (ab, ba)
        
        int[] s1Freq = new int[26];
        for(int i=0;i<s1.length();i++){
            s1Freq[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<=s2.length()-s1.length();i++){
            int[] s2Freq = new int[26];
            for(int j=0;j<s1.length();j++) //fill only 2 spots to match
                s2Freq[s2.charAt(i+j)-'a']++;
            
            if(isMatched(s1Freq, s2Freq))
                return true;
        }   
        
        return false;
        
    }
    
    public boolean isMatched(int[] s1Freq, int[] s2Freq){
        for(int i=0;i<26;i++){
            if(s1Freq[i] != s2Freq[i])
                return false;
        }
        return true;
    }
}