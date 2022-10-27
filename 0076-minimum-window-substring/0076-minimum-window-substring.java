class Solution {
    public String minWindow(String s, String t) {
        //sliding window problem
        //create 2 maps for s and t
        //check if required char of mapS is in mapT
        //move left and right accordingly
        
        if(s.length()==0|| t.length()==0)
            return "";
        
        Map<Character, Integer> map1 = new HashMap<>();
        for(int i=0;i<t.length();i++){
            map1.put(t.charAt(i), map1.getOrDefault(t.charAt(i), 0)+1);
        }
        
        int charRequired = map1.size();
        int charCompleted = 0;
        
        Map<Character, Integer> map2 = new HashMap<>();
        
        int ans[] ={-1, 0, 0}; //{windowsize, leftindex, rightindex}
        int l=0, r=0;
        while(r<s.length()){
            char c = s.charAt(r);
            map2.put(s.charAt(r), map2.getOrDefault(s.charAt(r), 0)+1);
            
            if(map1.containsKey(c) && map1.get(c).intValue() == map2.get(c).intValue())
                charCompleted++;
            
            
            while(l<=r && charCompleted == charRequired){
                c = s.charAt(l);
                //save min result
                if(ans[0] == -1 || r-l+1<ans[0]){
                    ans[0] = r-l+1;
                    ans[1]= l;
                    ans[2] = r;
                }
                
                map2.put(s.charAt(l), map2.get(s.charAt(l))-1);
                if(map1.containsKey(c) && map2.get(c).intValue()< map1.get(c).intValue())
                    charCompleted--;
                
                l++;
            }
            
            
            r++;
        }
        return ans[0]== -1? "": s.substring(ans[1], ans[2]+1);
    }
}