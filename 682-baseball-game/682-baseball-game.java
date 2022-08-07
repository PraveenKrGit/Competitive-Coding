class Solution {
    public int calPoints(String[] ops) {
        Deque<Integer> stack = new ArrayDeque();
        
        for(String op :ops){
            if(op.equals("D")){
                stack.push(2*stack.peek());
            }
            
            else if(op.equals("C")){
                stack.pop();
            }
            else if(op.equals("+")){
                int top = stack.pop();
                int newTop = top+stack.peek();
                stack.push(top);
                stack.push(newTop);
            }
            else
                stack.push(Integer.valueOf(op));
        }
        int sum=0;
        for(int n: stack)
            sum += n;
        
        return sum;
    }
}