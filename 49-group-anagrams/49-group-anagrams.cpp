class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        
        map<string, vector<string>> Map;
        
        for(int i=0; i<strs.size(); i++){
            string str = strs[i];
            sort(str.begin(), str.end());
            Map[str].push_back(strs[i]);
        }
        
        vector<vector<string>> result;
        
        for(auto t: Map){
            result.push_back(t.second);
        }
        return result;
    }
};