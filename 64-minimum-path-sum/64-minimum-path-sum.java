class Solution {
    // ============================ MEMOIZATION ===============================
    // static int solve(int grid[][], int i, int j, int m, int n, int cache[][]){
    //     if(i == m-1 && j == n-1){
    //         return grid[m-1][n-1];
    //     }
    //     if(i >= m || j >= n){
    //         return -1;
    //     }
    //     if(cache[i][j] != 0){
    //         return cache[i][j];
    //     }
    //     int t = 0;
    //     int s = 0;
    //     t = solve(grid, i, j+1, m, n, cache);
    //     s = solve(grid, i+1, j, m, n, cache);
    //     int x = Math.min(t, s);
    //     if(x == -1){
    //         cache[i][j] = Math.max(t,s) + grid[i][j];
    //         return cache[i][j];
    //     }
    //     cache[i][j] = x + grid[i][j];
    //     return cache[i][j];
    // }
    
    // ====================== TABULATION METHOD ========================
    
    static int tabulation(int grid[][], int m, int n) {
        int matrix[][] = new int[m][n];
        matrix[0][0] = grid[0][0];
        for (int i = 1; i < n; i++) {
            matrix[0][i] = matrix[0][i - 1] + grid[0][i];
        }

        for (int i = 1; i < m; i++) {
            matrix[i][0] = matrix[i - 1][0] + grid[i][0];
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                matrix[i][j] = Math.min(matrix[i - 1][j], matrix[i][j-1]) + grid[i][j];
            }
        }

        return matrix[m-1][n-1];
    }
    
    // ==================================================
    
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        // int cache[][] = new int[m+1][n+1];
        // return solve(grid, 0, 0, m, n, cache);
        return tabulation(grid, m,n);
    }
}