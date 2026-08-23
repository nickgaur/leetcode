class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] strArr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = strArr.length - 1; i >= 0; i--) {
            if (!strArr[i].isEmpty()) {
                sb.append(strArr[i] + " ");
            }

        }
        return sb.toString().trim();
    }
}