class Solution {
    public int myAtoi(String s) {
        int res = 0;
        s = s.trim();
        boolean neg = false;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (i == 0 && ch == '-') {
                neg = true;
            } else if (i == 0 && ch == '+') {
                neg = false;
            } else if (Character.isDigit(ch)) {
                int val = ch - '0';
                if (res > ((Integer.MAX_VALUE / 10)) || (res == (Integer.MAX_VALUE / 10) && (val > Integer.MAX_VALUE % 10))) {
                    return !neg ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }

                res = res * 10 + val;
            } else {
                break;
            }
        }
        if (neg) {
            return -res;
        }
        return res;
    }
}