class Solution {
public:
    vector<vector<int>> findDifference(vector<int>& nums1, vector<int>& nums2) {
        map<int, int> mp1;
        for(auto i: nums1){
            mp1[i]++;
        }
        map<int, int> mp2;
        for(auto i: nums2){
            mp2[i]++;
        }
        set<int> result1;
        for(auto i: nums1){
            if(!mp2[i]){
                result1.insert(i);
            }
        }
        set<int> result2;
        for(auto i: nums2){
            if(!mp1[i]){
                result2.insert(i);
            }
        }
        vector<vector<int>> result;
        vector<int> helper;
        for(auto i: result1){
            helper.push_back(i);
        }
        result.push_back(helper);
        helper.clear();
        for(auto i: result2){
            helper.push_back(i);
        }
        result.push_back(helper);
        return result;
    }
};