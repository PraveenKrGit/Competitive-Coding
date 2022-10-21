class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        
        ListNode slow = head, fast = head;
        ListNode first = null, second = null;
        
        for(int i=0;i<k-1;i++)
            fast = fast.next;
        
        first = fast;
        
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        
        second = slow;
        
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
        
        return head;
    }
}