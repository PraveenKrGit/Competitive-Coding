class KthLargest {
    
    //we could have used brute force but time complexity will be O(n) to add and pop
    // so we used priority queue to reduce time compl
    
    //MIN HEAP of size K
    //add and pop elem from min heap in O(log n) time
    //get min val in O(1) time
    
    /*
    
    1. create min heap of size k
    2. add initial input to min heap [4,5,8,2]
    3. while loop while size of heap is greater than k
        pop min value [2]
        we have min of size k: [4,5,8]
    4. add val to min heap [4,5,8,3] : added in log(n) time
    5. pop smallest one: popped in log(n) time
    */
    
    //add() -- add numbers to the already existing stream
    // also going to return kth largest element
    //count from back
    
    //int[] nums - initial list of elements to be given
    
    
    final PriorityQueue<Integer> heap = new PriorityQueue<>();
    final int k;
    
    //constructor
    public KthLargest(int k, int[] nums) {
        this.k = k;
        for(int n: nums)
            add(n);
    }
    
    public int add(int val) {
        if(heap.size()<k) //for adding values of array
            heap.offer(val);
        else if(val>heap.peek()){
            heap.poll(); //remove top elem(min ele)
            heap.add(val);
        }
        return heap.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */