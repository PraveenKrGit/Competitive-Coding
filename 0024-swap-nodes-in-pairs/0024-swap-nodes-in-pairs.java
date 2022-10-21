class Solution {
    public ListNode swapPairs(ListNode head) {
        
        if(head==null || head.next==null)
            return head;
        
        ListNode head2 = head.next;
        ListNode curr = head;

        
        while(curr != null && curr.next != null){
            ListNode temp = curr;
            curr = curr.next;
            
            temp.next= curr.next;
            curr.next=temp;
            
            curr = temp.next;
            
            if(curr!= null && curr.next != null)
                temp.next =curr.next;
            
        } 
        return head2;
    }
}