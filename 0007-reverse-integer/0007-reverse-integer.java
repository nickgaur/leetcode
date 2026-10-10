class Solution {
    private final int maxVal = Integer.MAX_VALUE;
    private final int minVal = Integer.MIN_VALUE;
    public int reverse(int x) {
        int res = 0;
        boolean flag = false;
        if (x > maxVal || x < minVal) {
            return 0;
        }
        if (x < 0) {
            flag = true;
            x = -x;
        }
        while (x > 0) {
            int lastDigit = x % 10;
            if(res > maxVal / 10){
                return 0;
            }
            res = ((res * 10) + lastDigit);
            x = x / 10;
        }
        if (flag) {
            return -res;
        }
        return res;
    }
}