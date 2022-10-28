class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        //add dictionary words to hashset
        //go through each word of sentence
        //then go through each letter of that word and store in prefix
        //if prefix is in set then break and build sentence using stringbuilder
        
        
        String[] words = sentence.split(" ");
        
        Set<String> set = new HashSet<>();
        
        for(String dictWord: dictionary){
           set.add(dictWord);
        }
        
        StringBuilder ans = new StringBuilder();
        for(String word: words){
            String prefix = "";
            for(int i=1;i<=word.length();i++){
                prefix = word.substring(0, i);
                if(set.contains(prefix))
                    break;
            }
            
            if(ans.length()>0)
                ans.append(" ");
            
            ans.append(prefix);
        }
        return ans.toString();
    }
}