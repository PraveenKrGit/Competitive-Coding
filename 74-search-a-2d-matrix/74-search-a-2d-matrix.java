class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        for(int i=rows-1, j=0;i>=0 && j<cols;){
            if(matrix[i][j]==target)
                return true;
            else if(matrix[i][j]<target)
                j++;
            else
                i--;
        }
        
        return false;
        
        
        
        //like binary search but in 2d
//         int m = matrix.length;
//         int n = matrix[0].length;
        
//         int low = 0;
//         int high = n-1;
//         int i=0;
//         while(low<=high){
//             int mid = (low+high)/2;
            
//             if(target == matrix[i][mid])
//                 return true;
//             else if(target>matrix[i][high]){
                
            
//                 if(m>i ){
//                 i++;
//                 low=0;
//                 high = n-1;
//                 }else{
//                     break;
//                 }
//             }
//             else if(target<matrix[i][mid])
//                 high=mid-1;
//             else if(target>matrix[i][mid])
//                 low = mid+1;
            
//         }
//         return false;
    }
}