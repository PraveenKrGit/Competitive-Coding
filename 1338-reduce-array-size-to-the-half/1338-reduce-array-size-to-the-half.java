class Solution {
    public int minSetSize(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int n: arr){
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        
        Queue<Integer> queue = new PriorityQueue<>((c,d) -> d-c);
        
        for(int m: map.keySet()){
            queue.offer(map.get(m));
        }
        
        int sum=0, res=0;
        
        while(!queue.isEmpty()){
            sum += queue.poll();
            res++;
            if(sum>= (arr.length+1)/2)
                return res;
        }
        return res;
    }
}