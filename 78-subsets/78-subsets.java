class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        
        //add [] to res
        res.add(new ArrayList<>());
        
        for(int n:nums){
            int size = res.size();
            for(int i=0;i<size;i++){
                //get subset from res at index i
                List<Integer> subset = new ArrayList<>(res.get(i));
                
                //add number to that subset
                subset.add(n);
                
                //add subset to res
                res.add(subset);
                
                //move to next subset
            }
        }
        
        return res;
    }
}