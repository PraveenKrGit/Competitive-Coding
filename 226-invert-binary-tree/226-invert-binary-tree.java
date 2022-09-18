class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null)
            return null;
        
        Deque<TreeNode> stack = new LinkedList<>();
        
        stack.push(root);
        
        
        //We use stack to puch a node and then exchange its left and right child
        // then push its left child and then its right child to stack
        
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            TreeNode left = node.left;
            
            node.left= node.right;
            node.right= left;
            
            if(node.left != null)
                stack.push(node.left);
            
            if(node.right != null)
                stack.push(node.right);
        }
        
        return root;
    }
}