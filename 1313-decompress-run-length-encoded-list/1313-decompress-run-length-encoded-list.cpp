class Solution {
public:
    vector<int> decompressRLElist(vector<int>& nums) {
        vector<int> res;
        int i{0};
        while(i < nums.size()){
            int t = nums.at(i);
            while(t--){
                res.push_back(nums.at(i+1));
            }
            i+=2;
        }
        return res;
    }
};