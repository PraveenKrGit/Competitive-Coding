class Solution {
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        
        int max =Integer.MIN_VALUE;
        int maxlevel =1;
        q.offer(root);
        
        for(int level = 1; !q.isEmpty();level++){
            int sum =0;
            for(int size = q.size(); size>0;size--){
                TreeNode node = q.poll();
                
                sum += node.val;
                
                if(node.left != null){
                    q.offer(node.left);
                }
                
                if(node.right != null){
                    q.offer(node.right);
                }
                
            }
            
            if(max<sum){
                    max = sum;
                    maxlevel = level;
                }
        }
        
        return maxlevel;
    }
}