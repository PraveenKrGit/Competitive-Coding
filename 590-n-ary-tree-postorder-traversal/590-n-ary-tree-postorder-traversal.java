class Solution {
    //Iterative Solution
    public LinkedList<Integer> postorder(Node root) {
        LinkedList<Integer> list = new LinkedList<>();
        Deque<Node> stack = new ArrayDeque<>();
        
        if(root== null)
            return list;
        
        stack.add(root);
        while(!stack.isEmpty()){
            root = stack.pop();
            list.addFirst(root.val);
            for(Node node: root.children){
                stack.push(node);
            }
        }
        
        return list;
    }
}