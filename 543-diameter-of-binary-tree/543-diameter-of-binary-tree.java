class Solution {
    
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        //returns height of that subtree
        maxDepthDfs(root);
        //returns global max
        return max;
    }
    
    public int maxDepthDfs(TreeNode root){
        if(root== null)
            return 0;
        
        int left = maxDepthDfs(root.left);
        int right = maxDepthDfs(root.right);
        
        //update global max
        max = Math.max(max, left+right);
        
        //returns height of that subtree
        return 1+Math.max(left, right);
    }
}