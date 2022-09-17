class Solution {
    
    static int solve(int grid[][], int row, int col, int m, int n){
        int result = 4;
        
        if(col < n-1 && grid[row][col+1] == 1){
            result -= 1;
        }
        
        if(col > 0 && grid[row][col-1] == 1){
            result -= 1;
        }
        
        if(row > 0 && grid[row-1][col] == 1){
            result -= 1;
        }
        if(row < m-1 && grid[row+1][col] == 1){
            result -= 1;
        }
        return result;
        
    }
    
    public int islandPerimeter(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int result = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == 1){
                    result += solve(grid, i, j, m, n);
                }
            }
        }
        return result;
    }
}