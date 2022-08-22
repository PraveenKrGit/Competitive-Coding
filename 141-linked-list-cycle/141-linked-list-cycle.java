
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next== null)
            return false;
        
        HashSet<ListNode> set = new HashSet<>();
        
        while(head != null){
            if(set.contains(head))
                return true;
            
            set.add(head);
            head = head.next;
        }
        
        return false;
        
    }
}