class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int prev = nums[0]; // base case
        int prev2 = 0;
        for (int i = 1; i < n; i++) {
            int pick = nums[i];
            if (i > 1) {
                pick += prev2; // index - 2
            }
            int notPick = 0 + prev; // index - 1
            int current = Math.max(pick, notPick);
            prev2 = prev;
            prev = current;
        }
        return prev;
    }
}