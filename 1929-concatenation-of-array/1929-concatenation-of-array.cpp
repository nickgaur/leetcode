class Solution {
public:
    vector<int> getConcatenation(vector<int>& nums) {
        int n = nums.size();
        vector<int> res(n*2);
        for(int i=0; i<res.size(); i++){
            res[i] = nums[i % n];
        }
        return res;
    }
};