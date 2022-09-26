class Solution {
public:
    vector<vector<int>> result;
    void solve(int n, int k,int index, vector<int> temp){
        if(temp.size() >= k){
            result.push_back(temp);
            return;
        }
        for(int i=index; i<=n; i++){
            temp.push_back(i);
            solve(n, k, i + 1, temp);
            temp.pop_back();
        }
    }
    vector<vector<int>> combine(int n, int k) {
        vector<int> temp;
        solve(n, k, 1, temp);
        return result;
    }
};