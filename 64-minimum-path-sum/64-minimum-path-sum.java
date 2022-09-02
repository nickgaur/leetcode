class Solution {
    static int solve(int grid[][], int i, int j, int m, int n, int cache[][]){
        if(i == m-1 && j == n-1){
            return grid[m-1][n-1];
        }
        if(i >= m || j >= n){
            return -1;
        }
        if(cache[i][j] != 0){
            return cache[i][j];
        }
        int t = 0;
        int s = 0;
        t = solve(grid, i, j+1, m, n, cache);
        s = solve(grid, i+1, j, m, n, cache);
        int x = Math.min(t, s);
        if(x == -1){
            cache[i][j] = Math.max(t,s) + grid[i][j];
            return cache[i][j];
        }
        cache[i][j] = Math.min(t,s)+grid[i][j];
        return cache[i][j];
    }
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int cache[][] = new int[m+1][n+1];
        return solve(grid, 0, 0, m, n, cache);
    }
}