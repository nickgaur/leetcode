class Solution {
    public void setZeroes(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        // NAIVE APPROACH
        // boolean col[] = new boolean[n];
        // boolean row[] = new boolean[m];
        // for (int i = 0; i < m; i++) {
        //     for (int j = 0; j < n; j++) {
        //         if (mat[i][j] == 0) {
        //             col[j] = true;
        //             row[i] = true;
        //         }
        //     }
        // }

        // for (int j = 0; j < col.length; j++) {
        //     if (col[j]) {
        //         for (int i = 0; i < m; i++) {
        //             mat[i][j] = 0;
        //         }
        //     }
        // }
        // for (int j = 0; j < row.length; j++) {
        //     if (row[j]) {
        //         for (int i = 0; i < n; i++) {
        //             mat[j][i] = 0;
        //         }
        //     }
        // }

        // EFFICIENT APPROACH
        boolean flag = false;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    mat[i][0] = 0;
                    if (j == 0) {
                        flag = true;
                    } 
                    else {
                        mat[0][j] = 0;
                    }
                }
            }
        }

        // mark all rows & columns as 0,
        // if there exist a 0 in that row or column
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (mat[i][0] == 0 || mat[0][j] == 0) {
                    mat[i][j] = 0;
                }
            }
        }

        // mark first column as 0
        if (mat[0][0] == 0) {
            for (int i = 0; i < n; i++) {
                mat[0][i] = 0;
            }
        }

        // mark first row as 0
        if (flag) {
            for (int i = 0; i < m; i++) {
                mat[i][0] = 0;
            }
        }
        
    }
}