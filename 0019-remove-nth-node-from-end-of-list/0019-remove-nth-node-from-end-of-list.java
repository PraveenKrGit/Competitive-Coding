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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //create distance between fast and slow by n
        
        ListNode slow = head, fast = head;
        
        for(int i=0;i<n;i++){
            fast = fast.next;    
        }
        
        if(fast==null)
            return head.next;
        
        while(fast.next != null){
            fast = fast.next;
            slow =slow.next;
        }
        
        
        slow.next = slow.next.next;
        return head;

        
    }
}



//         ListNode head = root;
//         if(head==null || head.next== null)
//             return head;
        
//         int count =1;
//         while(head != null){
//             count++;
//             head = head.next;
//         }
        
//         n = count -n;
        
//         if(n==0){
//             root = root.next;
//             return root;
//         }
//         head = root;
//         for(int i=0;i<=n;i++){
//             head = head.next;
//             //end ele case
//             if(i==count-1){
//                 head.next = null;
//             }
//             if(i==n){
//                 head.next = head.next.next;
//             }
            
            
//         }
//         return root;