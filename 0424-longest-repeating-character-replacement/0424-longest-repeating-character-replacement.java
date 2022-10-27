class Solution {
    public int characterReplacement(String s, int k) {
        //window sliding problem
        //calculate most freq char in a window ie right-left+1
        //calculate total char that can be changed in a window
        // that is (right-left+1)-most freq letter i.e window size- most freq letter
        //if(letters to change>k) then move left++ and reduce freq of letter at left
        
        int[] freq = new int[26];
        int left =0;
        int max=0;
        int mostFreqLetter=0;
        
        for(int right =0;right<s.length();right++){
            freq[s.charAt(right)-'A']++;
            mostFreqLetter = Math.max(mostFreqLetter, freq[s.charAt(right)-'A']);
            
            int lettersToChange = (right-left+1)-mostFreqLetter;
            if(lettersToChange>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            
            max = Math.max(max, right-left+1);
        }
        return max;
    }
}


//windowLen - count[maxOccuringChar] <=k
//         int n= s.length();
        
//         Map<Character, Integer> map = new HashMap<>();
        
//         for(int right =0;right<n;right++){
//             if(!map.contains(s.charAt(right))){
//                 map.put(s.charAt(right), 1);
//             }else{
//                 map.put(s.charAt(right), map.get(s.charAt(right))+1);
//             }
//             int winLen = right-left+1;
            
            
//             for(int i=0;i<26;i++){
//                 if(map.co)
//             }
//         }