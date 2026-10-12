class Solution {
    public int addDigits(int num) {
        int res = 0;
        if (num == 0) {
            return 0;
        }
        while (num > 9) {
            while (num > 0) {
                int lastDigit = num % 10;
                res = res + lastDigit;
                num = num / 10;
            }
            num = res;
            res = 0;
        }
        return num;
    }
}