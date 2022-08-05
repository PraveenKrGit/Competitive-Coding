class Solution {
    public int deepestLeavesSum(TreeNode root) {
        LinkedList<TreeNode> q = new LinkedList<>();
        int res =0, i;
        q.add(root);
        
        while(!q.isEmpty()){
            for(i= q.size()-1, res=0; i>=0;i--){
                TreeNode node = q.poll();
                res += node.val;
                
                if(node.right != null)
                    q.add(node.right);
                
                if(node.left != null)
                    q.add(node.left);
            }
        }
        
        return res;
    }
}