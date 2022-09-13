class Solution {
public:
    vector<int> countPoints(vector<vector<int>>& points, vector<vector<int>>& queries) {
        vector<int> result;
        for(auto query: queries){
            int count{0};
            for(auto point: points){
                int temp = pow(query[0]-point[0], 2) + pow(query[1]-point[1], 2) - pow(query[2],2);
                if(temp <= 0){
                    count++;
                }
            }
            result.push_back(count);
        }
        return result;
    }
};