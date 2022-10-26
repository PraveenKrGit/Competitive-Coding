//iterative
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Deque<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(p);
        queue.add(q);
        
        while(!queue.isEmpty()){
            TreeNode pp = queue.poll();
            TreeNode qq = queue.poll();
            
            if(pp == null && qq==null)
                continue;
            if(pp==null || qq==null)
                return false;
            if(pp.val != qq.val)
                return false;
            
            queue.add(pp.left);
            queue.add(qq.left);
            queue.add(pp.right);
            queue.add(qq.right);
        }
        
        return true;
    }
}


//recursion
// class Solution {
//     public boolean isSameTree(TreeNode p, TreeNode q) {
//         if(p==null && q==null)
//             return true;
//         if(p==null || q==null)
//             return false;
        
//         if(p.val != q.val)
//             return false;
        
//         return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
//     }
// }