class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        
        //putting key i.e. nums[] and its occurence in hashmap
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }else
                map.put(nums[i], map.get(nums[i])+1);
        }
        
        //Max-heap
        Queue<Integer> queue = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        
        //adding keys to max-heap
        for(int key: map.keySet())
            queue.add(key);

        int[] arr = new int[k];
        
        //displaying top k keys from heap
        for(int i=0;i<k;i++)
            arr[i] = queue.poll();
            
        return arr;
    }       
}