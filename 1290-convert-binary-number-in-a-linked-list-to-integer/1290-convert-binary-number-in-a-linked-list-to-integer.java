class Solution {
    public int getDecimalValue(ListNode root) {
        int sum =0;
        int count =1;
        
        ListNode head = root;
        
        while(head.next !=null){
            head = head.next;
            count++;
        }
        
        System.out.println(count);
        count--;
        head = root;
        while(head != null){
            sum += Math.pow(2, count--)*head.val;
            head = head.next;
        }
        
        return sum;
    }
}