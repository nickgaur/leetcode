class Solution {
public:
    int countNegatives(vector<vector<int>>& grid) {
        int count{0};
        for(auto g: grid){
            int low = 0;
            int high = g.size() - 1;
            while(low <= high){
                int mid = (high + low)/2;
                if(mid == 0 && g[mid] < 0){
                    count += g.size();
                }
                if (mid != 0 && g[mid] < 0 && g[mid - 1] >= 0) {
                    count += g.size() - mid;
                    break;
                }
                else if (g[mid] >= 0) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return count;
    }
};