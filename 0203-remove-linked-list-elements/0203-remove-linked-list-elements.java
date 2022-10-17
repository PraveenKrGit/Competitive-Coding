class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode node = head;
        // ListNode sentinel = new ListNode(0, head);
        // ListNode pred = sentinel;
        
        // ListNode fakeNode = new ListNode(0, head);
        // or
        ListNode fakeNode = new ListNode(-1);
        fakeNode.next=head;
        ListNode curr=head;
        ListNode prev= fakeNode;
        
        while(curr != null){
            if(curr.val == val){
                prev.next = curr.next;
            }else{
                prev = prev.next;
            }
            curr = curr.next;
        }
        
        return fakeNode.next;
    }
}