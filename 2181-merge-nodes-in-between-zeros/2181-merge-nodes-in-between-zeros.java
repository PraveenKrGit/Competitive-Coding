class Solution {
    public ListNode mergeNodes(ListNode head) {
        
        ListNode list1 = new ListNode(0); //create a node with val 0
        ListNode list2 = list1; //create dummy listnode of list1
        ListNode head2 = list1;
        
        ListNode temp = head.next;
        
        int sum =0;
        while(temp !=null){
            sum += temp.val;
            if(temp.val==0){
                ListNode node = new ListNode(sum); //create a new node;
                list2.next = node;//connect with dummy node which is created initially
                list2 = list2.next;//shift pointer to newly created node
                sum =0;
            }
            
            temp=temp.next;
        }
        
        return head2.next;
    }
}