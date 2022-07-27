/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        
        while(root!=null){
            list.add(root.val);
            
            if(root.right != null){
                stack.push(root.right);
            }
            
            root= root.left;
            
            if(root == null && !stack.isEmpty()){
                root = stack.pop();
            }
        }
        
        return list;
    }
}