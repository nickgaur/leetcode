class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        // int prevSum{nums[0]};
        // int currSum{prevSum};
        int res{nums[0]};
        int currSum{nums[0]};
        for(int i=1;i<nums.size(); i++){
            currSum = max(currSum + nums[i], nums[i]);
            res = max(res, currSum);
        }
        return res;
    }
};