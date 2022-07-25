class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] st = new int[256];
        int[] ts = new int[256];
        
        Arrays.fill(st, -1);
        Arrays.fill(ts, -1);
        
        for(int i=0;i<s.length();i++){
            char cs = s.charAt(i);
            char ct = t.charAt(i);
            
            
            if(st[cs] == -1 && ts[ct]==-1){
                st[cs] = ct;
                ts[ct]= cs;
            }
            else if(!(st[cs]==ct && ts[ct]==cs)){
                return false;
            }
            
            
           
        }
        
        return true;
    }
}