class Solution {
    public int diagonalSum(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int res = 0;
        for (int i = 0; i < m; i++) {
            res += mat[i][i];
        }
        for (int i = n - 1; i >= 0 ; i--) {
            res += mat[n - 1 - i][i];
        }
        if(m % 2 == 0){
            return res;
        }
        return res - mat[m/2][n/2];
    }
}