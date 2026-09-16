class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int res = 0;
        for (int i = 0; i < n; i++) {
            Set<Character> set = new HashSet<>();
            int len = 0;
            for (int j = i; j < n; j++) {
                if (!set.contains(s.charAt(j))) {
                    len++;
                    set.add(s.charAt(j));
                }
                else{
                    break;
                }
            }
            res = Math.max(res, len);
        }
        return res;
    }
}