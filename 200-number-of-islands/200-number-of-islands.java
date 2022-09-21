class Solution {
    static int solve(char[][] grid, int i, int j){
        if(i < 0 || j < 0 || i == grid.length || j == grid[0].length){
            return 0;
        }
        if(grid[i][j] == '0'){
            return 0;
        }
        grid[i][j] = '0';
        int right = solve(grid, i, j+1);
        int left = solve(grid, i, j-1);
        int up = solve(grid, i-1, j);
        int down = solve(grid, i+1, j);
        return 1;
    }
    
    public int numIslands(char[][] grid) {
        int result = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == '1'){
                    result += solve(grid, i, j);
                }
            }
        }
        return result;
    }
}