class Solution {
    
//     RECURSIVE METHOD
//     static int solve(String str1, String str2, int m, int n){
//         int count = 0;
//         if (m >= str1.length() || n >= str2.length()) {
//             return 0;
//         }

//         else if (str1.charAt(m) == str2.charAt(n)) {
//             count = solve(str1, str2, m + 1, n + 1) + 1;
//             return count;
//         } 
//         else {
//             int x =  solve(str1, str2, m + 1, n);
//             int y = solve(str1, str2, m, n + 1);
//             return Math.max(x, y);
//         }
//     }
    
//     MEMOIZATION METHOD
//      static int lcsMemo(String str1, String str2, int m, int n, int cache[][]) {
//         if (m == str1.length() || n == str2.length()) {
//             return 0;
//         }
        
//         if (cache[m][n] != 0) {
//             return cache[m][n];
//         }
        
//         int count = 0;
        
//         if (str1.charAt(m) == str2.charAt(n)) {
//             count = lcsMemo(str1, str2, m + 1, n + 1, cache) + 1;
//             cache[m][n] = count;
//             return count;
//         }
//         else {
//             int x = lcsMemo(str1, str2, m + 1, n, cache);
//             int y = lcsMemo(str1, str2, m, n + 1, cache);
//             cache[m][n] = Math.max(x, y);
//             return cache[m][n];
//         }
//     }
    
    // TABULATION METHOD
    static int tabulation(String str1, String str2) {
        int cache[][] = new int[str1.length() + 1][str2.length() + 1];
        for (int i = 0; i < cache.length; i++) {
            for (int j = 0; j < cache[i].length; j++) {
                if (i == 0 || j == 0) {
                    cache[i][j] = 0;
                } 
                else {
                    if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                        cache[i][j] = cache[i-1][j-1] + 1;
                    } 
                    else {
                        cache[i][j] = Math.max(cache[i - 1][j], cache[i][j - 1]);
                    }
                }
            }
        }
        return cache[str1.length()][str2.length()];
    }
    public int longestCommonSubsequence(String text1, String text2) {
        
        // RECURSIVE
        // return solve(text1, text, 0, 0);
        
        // MEMOIZATION
        // int cache[][] = new int[text1.length()][text2.length()];
        // return lcsMemo(text1, text2, 0, 0, cache);
        
        // TABULATION
        return tabulation(text1, text2);
    }
}