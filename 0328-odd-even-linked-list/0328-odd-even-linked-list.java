/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null)
            return null;
        ListNode odd= head;
        ListNode even = head.next;
        ListNode evenHead = even;
        
        // `even != null` rules out the list of only 1 node
        // `even.next != null` rules out the list of only 2 nodes 
        while(even != null && even.next!=null){
            // Put odd and even to the odd and even list
            odd.next = odd.next.next;
            even.next = even.next.next;
            
            //move pointer to next odd and even
            odd = odd.next;
            even = even.next;
            
        }
        
        odd.next= evenHead;
        return head;
    }
}