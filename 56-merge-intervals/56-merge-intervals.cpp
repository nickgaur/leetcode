class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& intervals) {
        vector<vector<int>> vec;
        sort(intervals.begin(), intervals.end());
        for(int i=0; i<intervals.size(); i++){
            if(vec.empty() || vec.back()[1] < intervals[i][0])              {
                vec.push_back(intervals[i]);
            }
            else {
                vec.back()[1] = max(intervals[i][1], vec.back()[1]);
            }
            
        }
        return vec;
    }
};