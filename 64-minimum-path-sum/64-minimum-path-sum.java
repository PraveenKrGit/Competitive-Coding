class Solution {
    
    static int[][] mem;
    public int minPathSum(int[][] grid) {
        int m = grid.length-1;
        int n = grid[0].length-1;
        
        mem = new int[m+1][n+1];
        
        return find(grid, m, n, mem);
    }
    
    public int find(int grid[][], int m, int n, int[][] mem){
        if(m<0 || n<0)
            return Integer.MAX_VALUE;
        
        else if(m==0 && n== 0)
            return grid[0][0];
        
        else if(mem[m][n] != 0)
            return mem[m][n];
        
        return mem[m][n]= grid[m][n] + Math.min(find(grid, m-1, n, mem), find(grid,m,n-1, mem));
    }
}