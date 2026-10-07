class Solution {
    private final int mod = 1000000007;
    public int rangeSum(int[] nums, int n, int left, int right) {
        int sumArr[] = new int[n * (n + 1) / 2];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum = sum + nums[j];
                sumArr[idx++] = sum;
            }
        }
        Arrays.sort(sumArr);
        int res = 0;
        for (int i = left; i <= right; i++) {
            res = (res + sumArr[i - 1]) % mod;
        }
        
        return res;
    }
}