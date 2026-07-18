class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        ArrayList<Integer> result = new ArrayList<>();
        int carry = 1;
        for (int i = n; i > 0; i--) {
            int sum = digits[i - 1] + carry;
            result.add(sum % 10);
            if (sum > 9) {
                carry = 1;
            } else {
                carry = 0;
            }
        }
        if(carry > 0){
            result.add(carry);
        }
        int m = result.size();
        int res[] = new int[m];
        for (int i = m - 1; i >= 0; i--) {
            res[i] = result.get(m - i - 1);
        }
        return res;
    }
}