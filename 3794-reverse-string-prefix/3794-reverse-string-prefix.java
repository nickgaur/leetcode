class Solution {
    public String reversePrefix(String s, int k) {
        int n = s.length();
        int low = 0;
        int high = k-1;
        StringBuilder result = new StringBuilder();

        while(high >= 0){
            result.append(s.charAt(high));
            high--;
        }
        result.append(s.substring(k, n));
        return result.toString();
    }
}