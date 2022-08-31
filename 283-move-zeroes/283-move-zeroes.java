class Solution {
    public void moveZeroes(int[] nums) {
        for(int i=nums.length-1; i>=0; i--){
            for(int j=1; j<=i; j++){
                if(nums[j-1] == 0){
                    int temp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}