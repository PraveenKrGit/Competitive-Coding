class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //start from top right
        //if target > num, that num cannot be in that row, so eliminate that row
        //if target < num, than that num cannot be in that column, so eliminate that col completely
        // Time complexity: O(m+n)
        
        //we can also search from bottom left
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        for(int i=0, j=cols-1; i<rows && j>=0;){
            if(matrix[i][j]==target)
                return true;
            else if(matrix[i][j]<target)
                i++;
            else
                j--;
        }
        
        return false;
    }
}