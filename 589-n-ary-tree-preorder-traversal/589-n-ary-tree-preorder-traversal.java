class Solution {
    
    //Recursive solution
    
    List<Integer> list = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        
        if(root == null)
            return list;
        
        list.add(root.val);
        for(Node node: root.children)
            preorder(node);
        
        return list;
    }
}