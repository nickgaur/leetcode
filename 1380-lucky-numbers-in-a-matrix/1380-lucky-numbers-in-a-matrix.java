class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> minValues = new ArrayList<>();
        List<Integer> maxValues = new ArrayList<>();

        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < row; i++) {
            int minVal = matrix[i][0];
            for (int j = 0; j < col; j++) {
                minVal = Math.min(minVal, matrix[i][j]);
            }
            minValues.add(minVal);
        }

        for (int i = 0; i < col; i++) {
            int maxVal = matrix[0][i];
            for (int j = 0; j < row; j++) {
                maxVal = Math.max(maxVal, matrix[j][i]);
            }
            maxValues.add(maxVal);
        }
List<Integer> result = new ArrayList<>();
        for(int i: minValues){
            for(int j: maxValues){
                if(i == j){
                    result.add(i);
                }
            }
        }
        return result;
    }

}