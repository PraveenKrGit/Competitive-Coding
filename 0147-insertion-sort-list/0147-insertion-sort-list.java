class Solution {
    public ListNode insertionSortList(ListNode head) {
        
        ListNode temp = new ListNode(0);
        
        temp.next = head;
        
        head = temp;
        temp = temp.next;
        ListNode temp2 = temp.next;
        ListNode prev = head;
        ListNode pt2 = temp;
        
        while(temp2 != null){

            while(temp2.val>temp.val){
               
                if(temp.next == temp2){
                    pt2 =pt2.next;
                    temp = head.next;
                    temp2 = temp2.next;
                    prev = head;
                }
                else{
                    temp = temp.next;
                    
                    prev = prev.next;
                }
                
                if(temp2==null)
                    return head.next;
            }
            
            ListNode next = temp2.next;
            temp2.next= temp;
            pt2.next = next;
            prev.next = temp2;
            
            temp2 = next;
            temp = head.next;
            prev = head;
            
            // display(head);
        }       
        return head.next;
    }
    
    // void display(ListNode head){
    //     ListNode temp = head;
    //     while(temp != null){
    //         System.out.print(temp.val+" ");
    //         temp = temp.next;
    //     }
    // }
}



// ListNode temp = new ListNode(0);
        
//         temp.next = head;
        
//         head = temp;
//         temp = temp.next;
//         ListNode temp2 = temp.next;
//         ListNode prev = head;
        
//         while(temp.next != null){
//             while(temp.val )
//             if(temp.val >temp2.val){
                
//                 ListNode next = temp2.next;
//                 temp2.next= temp;
//                 temp.next= next;
//                 prev.next = temp2;
//                 prev = prev.next;
//                 temp2 = temp2.next.next;
//                 display(head);
                
//             }
//             else{
//                 temp2 = temp2.next;
//                 prev.next = temp;
//                 prev = prev.next;
//                 temp = temp.next;
            
                
//             }
            
            
            
//         }
                

//         return head.next;
//     }
    
//     void display(ListNode head){
//         ListNode temp = head;
//         while(temp != null){
//             System.out.print(temp.val+" ");
//             temp = temp.next;
//         }