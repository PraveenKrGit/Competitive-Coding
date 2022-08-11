class Solution {
    public boolean isSymmetric(TreeNode root) {
        Deque<TreeNode> stack= new ArrayDeque<>();
        
        if(root==null)
            return false;
        
        TreeNode left, right;
        
        if(root.left !=null){
            if(root.right==null)
                return false;
            
            stack.push(root.left);
            stack.push(root.right);
        }else if(root.right!=null)
            return false;
        
        
        while(!stack.isEmpty()){
            if(stack.size()%2 != 0)
                return false;
            
            right = stack.pop();
            left = stack.pop();
            
            if(right.val != left.val)
                return false;
            
            if(left.left !=null){
                if(right.right==null)
                    return false;
                
                stack.push(left.left);
                stack.push(right.right);
            }
            else if(right.right != null)
                return false;
            
            if(left.right != null){
                if(right.left == null)
                    return false;
                
                stack.push(left.right);
                stack.push(right.left);
            }
            else if(right.left != null)
                return false;
        }
        
        return true;
    }
}