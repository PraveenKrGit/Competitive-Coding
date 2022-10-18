class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        
        //count number of nodes
        //count width of each arr
        //
        int count=0;
        ListNode curr = head;
        
        while(curr != null){
            curr= curr.next;
            count++;
        }
        
        ListNode[] arr = new ListNode[k];
        int width = count/k;
        int rem = count%k;
        
        curr=head;
        
        for(int i=0;i<k;i++){
            ListNode head2 = new ListNode(0);
            ListNode write = head2;
            for(int j=0;j<width+(i<rem?1:0);j++){
                write = write.next = new ListNode(curr.val);
                if(curr!=null){
                    curr = curr.next;
                }
            }
            
            arr[i]=head2.next;
        }
        
        
        // System.out.println(count);
        return arr;
    }
}