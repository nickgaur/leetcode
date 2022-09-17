class Solution {
    static int solve(int [][] grid, int row, int col, int m, int n){
        if(row < 0 || col < 0 || row >= m || col >= n){
            return 0;
        }
        
        if(grid[row][col] != 1){
            return 0;
        }
        
        grid[row][col] = -1;
        
        int result = 1;

        int right = solve(grid, row, col+1, m, n);
        if(right != 0){
            result += right;
        }
        
        int left = solve(grid, row, col-1, m, n);
        if(left != 0){
            result += left;
        }
        
        int up = solve(grid, row-1, col, m, n);
        if(up != 0){
            result += up;
        }
        
        int down = solve(grid, row+1, col, m, n);
        if(down != 0){
            result += down;
        }
        
        // grid[row][col] = 1;
      // System.out.println(result);
        return result;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int result = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == 1){
                    result = Math.max(result, solve(grid, i, j, m, n));
                }
            }
        }

        return result;
    }
}