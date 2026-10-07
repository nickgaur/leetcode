class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        int m = boxGrid.length;
        int n = boxGrid[0].length;

        char[][] result = new char[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[j][i] = boxGrid[i][j];
            }
        }

        // swap on y-axis
        for (int i = 0; i < n; i++) {
            int low = 0;
            int high = m - 1;
            while (low < high) {
                char temp = result[i][low];
                result[i][low] = result[i][high];
                result[i][high] = temp;
                low++;
                high--;
            }
        }

        // gravity fall
        for (int i = 0; i < m; i++) {
            int j = 0;
            int k = 0;
            while (j < n) {
                if (result[j][i] == '#') {
                    j++;
                } else if (result[j][i] == '.') {
                    char temp = result[j][i];
                    result[j][i] = result[k][i];
                    result[k][i] = temp;
                    k++;
                    j++;
                } else if (result[j][i] == '*') {
                    k = j + 1;
                    j++;
                }
            }
        }
        return result;
    }
}