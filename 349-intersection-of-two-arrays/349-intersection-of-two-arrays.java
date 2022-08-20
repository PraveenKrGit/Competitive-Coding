class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int n: nums1)
            set1.add(n);
        
        for(int n: nums2)
            set2.add(n);
        
        set1.retainAll(set2);
        
        int[] res = new int[set1.size()];
        
        int k=0;
        for(int i: set1){
            res[k++] = i;
        }
        
        return res;
    }
}