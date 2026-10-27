class Solution {
    public String[] createGrid(int m, int n) {
        String[] res = new String[m];
        char arr[][] = new char[m][n];
        for (int i = 0; i < m; i++) {
            char row[] = new char[n];
            for (int j = 0; j < n; j++) {
                row[j] = '#';
            }
            arr[i] = row;
        }

        int i = 0;
        int j = 0;

        while (i < m-1 && j < n-1) {
                arr[i][j] = '.';
                j++;
                arr[i][j] = '.';
                i++;
        }
        if(i == m-1){
            while(j < n){
                arr[i][j] = '.';
                j++;
            }
        }
        if(j == n-1){
            while(i < m){
                arr[i][j] = '.';
                i++;
            }
        }

        int index = 0;
        for (char ch[] : arr) {
            res[index++] = new String(ch);
        
        }
        return res;
    }
}