class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        map<string, vector<int>> Map;
        for(int i=0; i<strs.size(); i++){
            string str = strs[i];
            sort(str.begin(), str.end());
            Map[str].push_back(i);
        }
        vector<vector<string>> result;
        for(auto t: Map){
            vector<string> helper;
            for(auto i: t.second){
                helper.push_back(strs[i]);
            }
            result.push_back(helper);
        }
        return result;
    }
};