class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        ArrayList<Integer> result = new ArrayList<>();
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i: nums1)
            map.put(i, map.getOrDefault(i, 0)+1);
        
        for(int i: nums2){
            if(map.getOrDefault(i, 0) != 0){
                result.add(i);
                map.put(i, map.getOrDefault(i, 1)-1);
            }
        }
        
        int k=0;
        
        int[] res = new int[result.size()];
        
        for(int n: result){
            res[k++] = n;
        }
        
        return res;
        
    }
}