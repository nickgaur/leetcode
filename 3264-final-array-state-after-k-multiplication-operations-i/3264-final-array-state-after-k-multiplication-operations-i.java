class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int n = nums.length;
        for(int i = 0 ; i < k ; i++){
            int minIndex = 0;
            for(int j = 1 ; j < n; j++){
                if(nums[minIndex] > nums[j]){
                    minIndex = j;
                }
            }
            nums[minIndex] *= multiplier;
        }
        return nums;
    }
}