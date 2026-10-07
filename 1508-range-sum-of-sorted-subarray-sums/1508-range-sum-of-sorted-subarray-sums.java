class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        long sumArr[] = new long[n * (n + 1) / 2];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum = sum + nums[j];
                sumArr[idx++] = sum;
            }
        }
        Arrays.sort(sumArr);
        long res = 0;
        for (int i = left; i <= right; i++) {
            res = (res + sumArr[i - 1]);
        }
        res = (int)(res % (Math.pow(10,9) + 7));
        return (int)res;
    }
}