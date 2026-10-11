class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int product = 1;
       int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                product = product * nums[i];
            } else {
                count++;
            }
        }
        int result[] = new int[n];
        if(count > 1){
            return result;
        }
        for (int i = 0; i < n; i++) {
            if (count != 0) {
                if (nums[i] == 0) {
                    result[i] = product;
                }
            }
            else{
                result[i] = product / nums[i];
            }
        }
        return result;
    }
}