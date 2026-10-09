class Solution {
    public long subArrayRanges(int[] nums) {
        int n = nums.length;
        long res = 0;
        for (int i = 0; i < n; i++) {
            long smallest = nums[i];
            long largest = nums[i];
            long sum = 0;
            for (int j = i; j < n; j++) {
                smallest = Math.min(smallest, nums[j]);
                largest = Math.max(largest, nums[j]);
                sum += (largest - smallest);
            }
            res += sum;
        }
        return res;
    }
}