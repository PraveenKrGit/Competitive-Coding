class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if(strs == null || strs.length==0)
            return new ArrayList<>();
        
        Map<String, List<String>> map = new HashMap<>();
        
        for(String s : strs){
            char[] ch = s.toCharArray();
            
            Arrays.sort(ch);
            String Key = String.valueOf(ch);
            
            if(!map.containsKey(Key))
                map.put(Key, new ArrayList<>());
            
            map.get(Key).add(s);
        }
        
        return new ArrayList<>(map.values());
    }
}