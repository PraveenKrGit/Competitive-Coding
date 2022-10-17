class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;
        
        while(node != null){
            if(node.next == null){
                break;
            }
            //skip the duplicate node
            else if(node.val == node.next.val){
                node.next = node.next.next;
            }
            
            else
                node = node.next;
        }
        
        //return first node to display full list
        return head;
    }
}