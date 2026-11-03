class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        int maxVal = nums[0];
        for(int i = 1; i < n; i++){
            maxVal = Math.max(maxVal, nums[i]);
        }
        int res =0;
        for(int i = 0 ; i < n ; i++){
            res = res + maxVal - nums[i];
        }
        return res;
    }
}