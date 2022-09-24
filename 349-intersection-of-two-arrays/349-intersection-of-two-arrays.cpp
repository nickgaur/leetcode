class Solution {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
        map<int, int> mp;
        for(auto t: nums1){
            mp[t]++;
        }
        set<int> st;
        for(auto t: nums2){
            if(mp[t]){
                st.insert(t);
            }
        }
        vector<int> result;
        for(auto t: st){
            result.push_back(t);
        }
        return result;
    }
};