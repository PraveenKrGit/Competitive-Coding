class Solution {
    public int maxArea(int[] height) {
        
        //two pointers: one at first and other at last 
        //smaller height: move to next index
        //time: O(n)
        
        int n=height.length;
        int max=0, area=0;
        
        int i=0, j=n-1;
        
        while(i<j){
            if(height[i]<height[j]){
                area=height[i]*(j-i);
                i++;
            }
            else if(height[i]>height[j]){
                area= height[j]*(j-i);
                j--;
            }
            else if(height[i]==height[j]){
                area=height[j]*(j-i);
                i++;
            }
            
            if(max<area)
                max=area;
        }
        
        return max;
        
        
        
        //Time limit exceeded O(n^2)
//         int n=height.length;
//         int max=0;
//         int area = 0;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 if(i==j)
//                     continue;
                
//                 else if(height[i]<height[j])
//                     area= height[i]*Math.abs(j-i);
                
//                 else if(height[i]>height[j])
//                     area = height[j]*Math.abs(j-i);
                
//                 else if(height[i]==height[j] && i !=j)
//                     area= height[j]*Math.abs(j-i);
                
//                 if(max<area)
//                     max=area;
//             }
//         }
        
//         return max;
        
    }
}