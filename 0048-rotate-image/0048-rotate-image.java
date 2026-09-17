class Solution {
    static void swap(int arr[][], int i, int j) {
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }

    public void rotate(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        // transpose
        for (int i = 0; i < row; i++) {
            for (int j = i; j < col; j++) {
                swap(matrix, i, j);
            }
        }

        // rotate over y-axis
        for(int i = 0 ; i < row; i++){
            int start = 0;
            int end = col-1;
            while(start < end){
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
            }
        }
    }
}