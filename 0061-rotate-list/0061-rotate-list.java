class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head == null || head.next==null){
            return head;
        }
        
        ListNode node = head;
        int count = 1;
        while(node.next != null){
            count++;
            node = node.next;
        }
        
        //if k=3, count = 5, we move node 5-3=3 places
        //if k=8, count = 5, ultimately k=3 for 8%5 5-3=2 places moved so k%=count;
        k%= count;
        node.next = head;
        
        for(int i=0;i<count-k;i++){
            node = node.next;
        }
        
        head = node.next;
        node.next = null;
        
        return head;
    }
}