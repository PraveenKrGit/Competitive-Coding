class Solution {
    public ListNode deleteMiddle(ListNode head) {
        
        if(head.next == null){
            head = null;
            return head;
        }
        
        ListNode start = head;
        int count =1;
        
        while(start.next != null){
            count++;
            start= start.next;
        }
        
        int n = count/2;
        start = head;
        for(int i=0;i<n;i++){
            
            if(i==n-1){
                start.next = start.next.next;
            }
            start = start.next;
        }
        
        return head;
    }
}