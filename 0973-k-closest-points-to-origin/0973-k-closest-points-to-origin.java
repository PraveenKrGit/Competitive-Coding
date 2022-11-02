class Solution {
    public int[][] kClosest(int[][] points, int k) {
        
        //create arr[] queue
        //compare between two subarray of 2d array by calculating euclidean distance
        //add the points[][] to queue, it will sort by distance of two subarray
        //move through each subarray and poll to remove the subarray from queue and add to ans

        PriorityQueue<int[]> queue = new PriorityQueue<>((a,b)->
            Integer.compare(
                (a[0]*a[0] + a[1]*a[1]),
                (b[0]*b[0] + b[1]*b[1])
            )
        );
        
        for(int[] point: points){
            queue.add(point);
        }
        
        int[][] ans = new int[k][2];
        
        for(int i=0;i<k;i++){
            int[] curr= queue.poll();
            ans[i][0] = curr[0];
            ans[i][1] = curr[1];
        }
        
        return ans;
        
        
        
//         int j=0;
//         for(int i=0;i<len;i++){
//                 int a  =(int) Math.pow(points[i][j], 2);
//                 int b  =(int) Math.pow(points[i][j+1], 2);
//                 int sum = a+b;
//                 queue.add(sum);
//         }
        
//         // Iterator<Integer> itr3 =queue.iterator();
//         // while (itr3.hasNext())
//         //     System.out.println(itr3.next());
        
        
//         Iterator<Integer> i = queue.iterator();
//         while(i.hasNext())
//             System.out.println(i.next());
        
//         return points;
        
    }
}