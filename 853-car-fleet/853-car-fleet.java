class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        //to return numbers of fleet formed, 1 can also be fleet
        //add position and its time taken to reach target (target-position[i])/speed[i]
        //sort that in increasing order
        //run in that loop from right side of array
        if(position.length <=0)
            return 0;
        
        double[][] car = new double[position.length][];
        
        for(int i=0;i<position.length;i++){
            car[i] = new double[]{position[i], (double) (target-position[i])/speed[i]};
        }
        
        Arrays.sort(car, (a,b)-> Double.compare(a[0],b[0]));
        
        int res=0;
        double curr=0;
        for(int i=position.length-1;i>=0;i--){
            if(car[i][1]>curr){
                curr=car[i][1];
                res++;
            }
        }
        
        return res;
    }
}