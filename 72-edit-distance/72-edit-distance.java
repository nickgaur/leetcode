class Solution {
    
    static int solve(String word1, String word2, int i, int j, int cache[][]){
        int count = 0;
        if(i == 0){
            return j;
        }
        if(j == 0){
            return i;
        }
        if(cache[i][j] != 0){
            return cache[i][j];
        }
        if(word1.charAt(i - 1) == word2.charAt(j - 1)){
            return solve(word1, word2, i - 1, j - 1, cache);
        }
        int insert = solve(word1, word2, i - 1, j, cache);
        int remove = solve(word1, word2, i, j - 1, cache);
        int replace = solve(word1, word2, i - 1, j - 1, cache);
        count = Math.min(Math.min(insert, remove), replace);
        cache[i][j] = count + 1;
        return cache[i][j];
        
    }
    
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int cache[][] = new int[m+1][n+1];
        return solve(word1, word2, m, n, cache);
    }
}