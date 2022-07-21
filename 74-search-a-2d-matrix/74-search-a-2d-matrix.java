class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0; i<matrix.length; i++){
            if(target >= matrix[0][0] && target <= matrix[i][matrix[i].length - 1]){
                int p = 0;
                int q = matrix[i].length -1 ;
                while(p <= q){
                    int t = (p+q)/2;
                    if(target == matrix[i][t]){
                        return true;
                    }
                    else if(target < matrix[i][t]){
                        q = t - 1;
                    }
                    else if(target > matrix[i][t]){
                        p = t + 1;
                    }
                }
            }
        }
        return false;
    }
}