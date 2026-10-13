class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        for(int i = 0 ; i < n; i++){
            if(nums[i] < 0){
                nums[i] = -nums[i];
            }
        }
        Arrays.sort(nums);
        // int arr[] = new int[n];
        int i = 0;
        int t = n - 1;
        long res = 0;
        while (i <= t) {

            if (i == t) {
                res = res + (nums[t] * nums[t]);
            } else {
                res = res + (nums[t] * nums[t]) - (nums[i] * nums[i]);
            }
            i++;
            t--;
        }
        return res;
    }
}