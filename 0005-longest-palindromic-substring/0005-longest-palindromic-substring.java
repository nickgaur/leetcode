class Solution {
    static boolean isPal(String s, int low, int high) {
        // int low = 0;
        // int high = s.length() - 1;
        while (low < high) {
            if (s.charAt(low) != s.charAt(high)) {
                return false;
            }
            low++;
            high--;
        }
        return true;
    }

    public String longestPalindrome(String s) {
        int n = s.length();
        String res = "";
        for (int i = 0; i < n; i++) {
            int len = 0;
            for (int j = i; j < n; j++) {
                if (isPal(s, i, j)) {
                    // len = j - i + 1;
                    // len = Math.max(j - i );
                    if(s.substring(i, j+1).length() > res.length()){
                        res = s.substring(i,j+1);
                    }
                }
            }
        }
        return res;
    }
}