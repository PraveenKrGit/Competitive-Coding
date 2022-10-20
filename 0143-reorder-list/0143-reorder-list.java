class Solution {
    public void reorderList(ListNode head) {
        if(head == null || head.next==null){
            return;
        }
        
        ListNode prev = null, slow = head, fast = head;
        
        while(fast!= null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        prev.next = null;
        ListNode l1 = head;
        ListNode l2 = reverse(slow);
        
        
        merge(l1, l2);
               
    }
    
    public ListNode reverse(ListNode slow){
        ListNode prev = null, next = null;
        ListNode curr = slow;
        
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr =next;
        }
        
        return prev;
    }
    
    void merge(ListNode l1, ListNode l2){
        
        
        while(l1 != null){
            ListNode n1 = l1.next, n2 = l2.next;
            l1.next = l2;
            if (n1==null)
                break;
            
            
            l2.next = n1;
            l1 = n1;
            l2 = n2;
        }
    }
}


//          Stack<ListNode> stack = new Stack<>();
        
//         ListNode start = head;
        
//         int count = 1;
//         while(start.next!= null){
//             count++;
//             start = start.next;
//         }
        
//         start = head;
//         for(int i=0;i<count&& start.next != null;i++){
//             if(i>count/2){
//                 stack.push(start);
//             }
//             start = start.next;
//         }
        
//         start = head;
//         while(stack != null){
//             int a
//             System.out.println();
//         }
        
//         return;