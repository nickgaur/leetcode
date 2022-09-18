class Solution {
public:
    vector<int> sortedSquares(vector<int>& nums) {
        vector<int> result(nums.size(), 0);
        int i = 0;
        int j = nums.size() - 1;
        int temp = nums.size() - 1;
        while(i <= j){
            if((nums[i] * nums[i]) < (nums[j] * nums[j])){
                result[temp] = nums[j] * nums[j];
                j--;
            }
            else {
                result[temp] = nums[i] * nums[i];
                i++;
            }
            temp--;
        }
        return result;
    }
};