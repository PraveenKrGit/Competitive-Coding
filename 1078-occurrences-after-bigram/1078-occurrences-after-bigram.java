class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        List<String> res = new ArrayList<>();
        String[] words = text.split(" ");
        
        for(int i=2;i< words.length;i++){
            if(first.equals(words[i-2]) && second.equals(words[i-1])){
                res.add(words[i]);
            }
        }
        
        return res.toArray(new String[0]);
    }
}