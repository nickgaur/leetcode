class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        int i=0;
        vector<string> strsCopy{strs};
        map<string, int> Map;
        vector<vector<string>> result{};
        for(int i=0; i<strsCopy.size(); i++){
            sort(strsCopy[i].begin(), strsCopy[i].end());
            Map[strsCopy[i]]++;
        }
        
        for(auto t: Map){
            vector<string> helper;
            for(int i=0; i<strsCopy.size(); i++){
                if(strsCopy[i] == t.first){
                    helper.push_back(strs[i]);
                }
            }
            result.push_back(helper);
        }
        return result;
    }
};