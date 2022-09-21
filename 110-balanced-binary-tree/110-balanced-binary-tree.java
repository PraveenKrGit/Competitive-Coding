class Solution {
    private boolean res = true;
    
    public boolean isBalanced(TreeNode root) {
        
        //do a dfs on left subtree and then on right subtree
        //and then find diff to see if diff is 1 or more than 1
        
        maxDepthDfs(root);
        return res;
        
    }
    
    private int maxDepthDfs(TreeNode root){
        if(root == null)
            return 0;
        //get left and right height
        int leftHeight = maxDepthDfs(root.left);
        int rightHeight = maxDepthDfs(root.right);
        
        
        if(Math.abs(leftHeight-rightHeight)>1)
            res = false;
        
        return 1 + Math.max(leftHeight, rightHeight);
    }
}