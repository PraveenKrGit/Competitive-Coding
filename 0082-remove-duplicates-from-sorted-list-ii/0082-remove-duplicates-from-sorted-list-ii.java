class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        //use fake head(sentinel & pred) and point it to 0
        //use pred to skip to the node that has no duplicate
        //using 2 pointers : head and pred
        //pred : skips duplicate
        
        ListNode sentinel = new ListNode(0, head);
        
        ListNode pred = sentinel;
        
        while(head != null){
            if(head.next != null && head.val == head.next.val){
                while(head.next != null && head.val == head.next.val){
                    head= head.next;
                }
                pred.next = head.next;
            }else{
                pred = pred.next;
            }
            head = head.next;
        }
        
        return sentinel.next;
    }
}