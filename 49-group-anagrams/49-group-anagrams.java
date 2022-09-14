class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if(strs == null || strs.length==0)
            return new ArrayList<>();
        
        Map<String, List<String>> map = new HashMap<>();
        
        for(String s : strs){
            char[] ch = s.toCharArray();
            
            Arrays.sort(ch);
            //String.valueOf(char array) returns the array in String format
            //i.e. ['p','r','a'] means it returns pra,
            String Key = String.valueOf(ch);
            
            if(!map.containsKey(Key))
                map.put(Key, new ArrayList<>()); //adds empty arraylist to key pra
            
            map.get(Key).add(s);  //add that string s to arraylist of key pra
        }
        
        return new ArrayList<>(map.values());
    }
}