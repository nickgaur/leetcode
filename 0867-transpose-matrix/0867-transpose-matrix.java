class Solution {
    // static void swap(int arr[][], int i, int j) {
    //     int temp = arr[i][j];
    //     arr[i][j] = arr[j][i];
    //     arr[j][i] = temp;
    // }

    public int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int res[][] = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                res[j][i] = matrix[i][j];
            }
        }
        return res;
    }
}