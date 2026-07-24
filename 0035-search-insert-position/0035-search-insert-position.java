class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        for(int i =0;i < n; i++){
            if(nums[i] == target){
                return i;
            }
            else if(i == 0 && target < nums[0]){
                return 0;
            }
            else if(i == n-1 && target > nums[n-1]){
                return n;
            }
            else if(target > nums[i] && target < nums[i+1]){
                return i + 1;
            }
        }
        return 0;
    }
}