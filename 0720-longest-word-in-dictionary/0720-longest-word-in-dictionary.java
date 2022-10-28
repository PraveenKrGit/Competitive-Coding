class Solution {
    public String longestWord(String[] words) {
        //sort the array of words such that smaller words appear firstly
        //move through sorted array and check if their one less substring is in hashset
        Arrays.sort(words);
        Set<String> set = new HashSet<>();
        
        String ans = "";
        
        for(String word: words){
            if(word.length()==1 || set.contains(word.substring(0, word.length()-1))){
                ans = word.length() > ans.length()? word:ans;
                set.add(word);
            }  
        }
        return ans;
    }
}