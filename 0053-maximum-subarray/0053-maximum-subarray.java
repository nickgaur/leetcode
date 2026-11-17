class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int res = nums[0];
        // for(int i = 0 ; i < n; i++){
        //     int sum = 0;
        //     for(int j = i; j < n; j++){
        //         sum += nums[j];
        //         res = Math.max(res, sum);
        //     }
        // }
        // return res;
        int sum = nums[0];
        for(int i = 1 ; i < n ;i++){
            sum = Math.max(sum + nums[i], nums[i]);
            res = Math.max(sum, res);
        }
        return res;
    }
}