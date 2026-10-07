class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        int m = boxGrid.length;
        int n = boxGrid[0].length;

        char[][] result = new char[n][m];

        for (int i = 0; i < m; i++) {
            int j = 0;
            int k = 0;
            while (j < n) {
                if (boxGrid[i][j] == '#') {
                    j++;
                } else if (boxGrid[i][j] == '.') {
                    boxGrid[i][j] = '#';
                    boxGrid[i][k] = '.';
                    k++;
                    j++;
                } else if (boxGrid[i][j] == '*') {
                    k = j + 1;
                    j++;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[j][m - 1 - i] = boxGrid[i][j];
            }
        }
        return result;
    }
}