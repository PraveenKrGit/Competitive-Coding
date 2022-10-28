class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        //Time complexity : O(n)
        //We use Monotonic decreasing queue
        //deque : double ended queue
        //we use deque so that we can remove element at rear in O(1) time 
        //when we shift window to the right
        //pop if curr val is greater than front end to maintain monotonic
        //max value = left most value in deque
        
        Deque<Integer> deque = new ArrayDeque<>(); //stores indexes like 0,1,2,3..
        int[] ans = new int[nums.length-k+1]; //stores nums like 8, 5,9..
        int ansIndex =0;
        
        for(int i=0;i<nums.length;i++){
            //removes last element if it is small than curr ele 
            //takes only O(1) time
            while(!deque.isEmpty() && nums[deque.getLast()]< nums[i])
                deque.removeLast();
            
            deque.addLast(i); //adding index of curr ele of nums
            
            //remove ele if it is outside the window
            if(deque.getFirst()== i-k)
                deque.removeFirst();
            
            //adding ele to ans only if i is greater or equal to k-1
            if(i>=k-1)
                ans[ansIndex++] = nums[deque.peek()];
        }
        
        return ans;
        
    }
}

//Time complexity : O(k.(n-k))
//         int left =0;
//         int right =k-1;
//         int max=0;
//         int total = nums.length-k+1;
        
//         int[] ans = new int[total];
//         int j=0;
//         while(right<nums.length){
//             max=nums[left];
//             for(int i=left+1;i<=right;i++){
//                 if(nums[i]>max)
//                     max=nums[i];
//             }
            
//             ans[j++]= max;
            
//             left++;
//             right++;
//             //System.out.print(left+" "+right+" "+max+" ");
//         }
        
//         return ans;