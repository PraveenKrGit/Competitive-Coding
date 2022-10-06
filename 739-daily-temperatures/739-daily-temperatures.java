class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        //how many days it takes to get temp higher than curr temp
        //we store the 'how many days' for curr days
        //for ex : for 73 it took 1 day
        //for 75 it took 4 days
        //for76 and 73 ans is 0 as there isnt any temp greater than them
        
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[temperatures.length];
        
        for(int i=0;i<temperatures.length;i++){
            while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]){
                int index = stack.pop();
                res[index] = i-index;
            }
            
            stack.push(i);
        }
        return res;
    }
}