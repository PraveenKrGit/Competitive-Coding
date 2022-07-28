class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new LinkedList<>();
        
        if(root== null)
            return list;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        
        while(!queue.isEmpty()){
            
            int n= queue.size();
            
            List<Integer> currList = new ArrayList<>();
            
            for(int i=0;i<n;i++){
                TreeNode curr = queue.poll();
                currList.add(curr.val);
                
                if(curr.left !=null)
                    queue.offer(curr.left);
                
                if(curr.right != null)
                    queue.offer(curr.right);
            }
            
            list.add(currList);
            
        }
        
        return list;
    }
}