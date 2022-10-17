class Solution {
    public void deleteNode(ListNode node) {
        // "Delete a value in a linked list"
        
        // 1. store val of next node in curr node 'node' given above
        // 2. point the new stored val to the next of the node from where val is taken
        node.val = node.next.val;
        node.next = node.next.next;
    }
}