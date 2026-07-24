class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) {
            return -1;
        }
        int j = 0;
        int m = haystack.length();
        int n = needle.length();
        int i = 0;
        int temp = 0;
        while (i < m && j < n) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                j++;
                i++;
            } else {
                j = 0;
                i = temp + 1;
                temp++;
            }
            if (j >= n) {
                return i - n;
            }
        }
        return -1;
    }
}