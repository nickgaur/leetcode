class Solution {
public:
    vector<string> solve(int n){
        vector<string> result;
        if(n == 0){
            result.push_back("");
            return result;
        }
            vector<string> returnedVector = solve(n-1);
                for(string str: returnedVector){
                    str += "0";
                    result.push_back(str);
                }
            for(string str: returnedVector){
                    str += "1";
                    result.push_back(str);
                }
        return result;
    }
    string findDifferentBinaryString(vector<string>& nums) {
        map<string, int> mp;
        for(auto str: nums){
            mp[str]++;
        }
        vector<string> ans = solve(nums[0].length());
        for(auto t: ans){
            if(mp[t] == 0){
                return t;
            }
        }
        return "";
    }
};