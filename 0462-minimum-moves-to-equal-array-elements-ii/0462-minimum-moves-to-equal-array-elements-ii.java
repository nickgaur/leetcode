class Solution {
    public int minMoves2(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int mid = n/2;
        int res =0;
        for (int i = 0; i < n; i++) {
                res += Math.abs(nums[i] - nums[mid]);
        }
        return res;
    }
}