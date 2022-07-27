class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list = new LinkedList<>();
        
        Queue<Node> queue = new LinkedList<>();
        
        if(root== null)
            return list;
        
        queue.offer(root);
        
        while(!queue.isEmpty()){
            int len = queue.size();
            List<Integer> currList = new LinkedList<>();
            
            for(int i= 0;i<len;i++){
                Node curr= queue.poll();
                currList.add(curr.val);
                
                for(Node node: curr.children){
                    queue.offer(node);
                }
            }
            list.add(currList);
        }
        
        return list;
    }
}