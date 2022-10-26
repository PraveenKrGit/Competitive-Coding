class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0){
            return null;
        }
        ListNode head = null;
        ListNode prev = null;
        
        PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(lists.length, (a,b) -> a.val - b.val);

        //add first elements of each list to pqueue
        for(ListNode node : lists){
            if(node != null)
                queue.add(node);
        }  
        
        //iterate through queue and keep updating linkedlist
        //and adding that nodes next to queue
        while(!queue.isEmpty()){
            ListNode curr = queue.poll();
            
            if(head==null){
                head=curr;
                prev = head;
            }else{
                prev.next = curr;
                prev = prev.next;
            }
            
            if(curr.next != null){
                queue.add(curr.next);
            }
        }
        
        return head;
        
    }
}