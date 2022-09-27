class Solution {
public:
    vector<int> kWeakestRows(vector<vector<int>>& mat, int k) {
        map<int, int>mp;
        vector<int> vec;
        for(int i = 0; i < mat.size(); i++){
            mp[i] = 0;
            for(auto t: mat[i]){
                if(t == 1){
                    mp[i]++;
                }
            }
            vec.push_back(mp[i]);
        }
        sort(vec.begin(), vec.end());
        vector<int> result;
        for(int i=0; i<k; i++){
            for(auto t: mp){
                if(vec[i] == t.second){
                    result.push_back(t.first);
                    mp[t.first] = -1;
                    break;
                }
            }
        }
        return result;
    }
};