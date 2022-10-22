class Solution {
    public char repeatedCharacter(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char c=' ';
        
        for(int i=0;i<s.length();i++){
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
            
            if(map.get(s.charAt(i))==2){
                c = s.charAt(i);
                break;
            }
        }
        return c;
    }
}