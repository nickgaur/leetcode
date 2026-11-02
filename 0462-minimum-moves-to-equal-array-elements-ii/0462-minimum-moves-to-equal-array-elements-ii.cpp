class Solution {
public:
    int minMoves2(vector<int>& nums) {
        int res = 0;
        int mid = nums.size() / 2;
        sort(nums.begin(), nums.end());
        for(int i = 0 ;i < nums.size(); i++){
            res += abs(nums[i] - nums[mid]);
        }
        return res;
    }
};