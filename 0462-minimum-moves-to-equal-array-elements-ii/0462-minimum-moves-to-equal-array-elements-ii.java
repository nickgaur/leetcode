class Solution {
    public int minMoves2(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int increment = 0;
        int decrement = 0;
        int minValue = nums[0];
        int maxValue = nums[0];
        int mid = n/2;
        int res =0;
        for (int i = 0; i < mid; i++) {
            if(nums[i] != nums[mid]){
                res += (nums[mid] - nums[i]);
            }
        }
        for (int i = mid; i < n; i++) {
            if(nums[i] != nums[mid]){
                res += (nums[i] - nums[mid]);
            }
        }
        return res;
    }
}