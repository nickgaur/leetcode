class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        int min_value = nums[0];
        for(int i = 1 ; i < n; i++){
            min_value = Math.min(min_value, nums[i]);
        }
        int res = 0;
        for(int i = 0; i < n; i++){
            res = res + nums[i] - min_value;
        }
        return res;
    }
}