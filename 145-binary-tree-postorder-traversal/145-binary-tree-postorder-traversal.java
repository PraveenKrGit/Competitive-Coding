class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        LinkedList<Integer> list = new LinkedList<>();
        
        if(root==null)
            return list;
        
        stack.push(root);
        
        while(!stack.isEmpty()){
            TreeNode curr = stack.pop();
            list.addFirst(curr.val);
            
            if(curr.left != null)
                stack.push(curr.left);
            
            if(curr.right != null)
                stack.push(curr.right);
        }
        
        return list;
    }
}