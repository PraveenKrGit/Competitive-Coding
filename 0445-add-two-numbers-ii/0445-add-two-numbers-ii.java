class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        //reverse l1 and l2
        //add by each node
        //reverse the result
        
        ListNode list1 = l1;
        ListNode list2 = l2;
        
        ListNode prev = null, next = null, curr = list1;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr= next;
        }
    
        list1 = prev;
        
        prev = null; next=null; curr=list2;
        
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr= next;
        }
        
        list2 = prev;
        
        int sum =0;
        int rem=0;
        int q=0;
        ListNode list3 = new ListNode();

        ListNode head2 = list3;

        int carry = 0;

        for(int i = 1; list1 != null || list2 != null; i++){

            int currSum = list1.val + list2.val + carry;
            list3 = list3.next = new ListNode(currSum%10);
            
            if(currSum > 9 ){
                carry = 1;
            } else {
                carry = 0;
            }


            if(list1.next ==null && list2.next==null && currSum>9){
                list3 = list3.next = new ListNode(carry);
                break;
            }
            else if(list1.next ==null && list2.next==null)
                break;

            
            if(list1.next != null)
                list1 = list1.next;
            else
                list1.val=0;

            if(list2.next != null)
                list2 = list2.next;
            else
                list2.val=0;
        }
        
        // print(head2.next);
        
        prev = null; next=null; curr=head2.next;
        
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr= next;
        }
        head2 = prev;
        // print(head2);
        
        return head2; 
        
    }
    
    // void print(ListNode node){
    //     ListNode prev = node;
    //     while(prev != null){
    //         System.out.println(prev.val);
    //         prev = prev.next;
    //     }
    // }
}