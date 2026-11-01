class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        int res = 0;
        Arrays.sort(nums);
        for(int i = n-1; i >= 0; i--){
            res = res + nums[i] - nums[0];
        }
        return res;
    }
}