class Solution {
    public void setZeroes(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        boolean col[] = new boolean[n];
        boolean row[] = new boolean[m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    col[j] = true;
                    row[i] = true;
                }
            }
        }

        for (int j = 0; j < col.length; j++) {
            if (col[j]) {
                for (int i = 0; i < m; i++) {
                    mat[i][j] = 0;
                }
            }
        }
        for (int j = 0; j < row.length; j++) {
            if (row[j]) {
                for (int i = 0; i < n; i++) {
                    mat[j][i] = 0;
                }
            }
        }
        
    }
}