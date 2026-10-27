class Solution {
    public String[] createGrid(int m, int n) {
        String[] res = new String[m];
        char arr[][] = new char[m][n];
        
        for(int i = 0 ; i < m; i++){
            for(int j = 0 ;  j < n ;j++){
                arr[i][j] = '#';
            }
        }

        for(int i = 0 ; i < m; i++){
            arr[i][0] = '.';
        }
        for(int i = 0 ; i < n; i++){
            arr[m-1][i] = '.';
        }

        int index = 0;
        for (char ch[] : arr) {
            res[index++] = new String(ch);
        
        }
        return res;
    }
}