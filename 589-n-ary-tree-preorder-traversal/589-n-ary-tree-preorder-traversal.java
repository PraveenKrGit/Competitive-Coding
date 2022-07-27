
class Solution {
    
    //Iterative solutiion
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        Deque<Node> stack = new ArrayDeque<>();
        
        if(root== null)
            return list;
        
        stack.push(root);
        
        while(!stack.isEmpty()){
            root = stack.pop();
            list.add(root.val);
            
            for(int i=root.children.size()-1;i>=0;i--){
                stack.push(root.children.get(i));
            }
        }
        
        return list;
    }
}