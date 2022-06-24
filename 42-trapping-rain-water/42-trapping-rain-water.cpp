class Solution {
public:
    int trap(vector<int>& bars) {
        size_t n{bars.size()};
        vector <int> leftBarsMax(n, 0);
        vector <int> rightBarsMax(n, 0);
        leftBarsMax[0] = bars[0];
        for (int i = 1; i < n; i++) {
            leftBarsMax[i] = max(leftBarsMax[i - 1], bars[i]);
        }
        rightBarsMax[n - 1] = bars[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightBarsMax[i] = max(rightBarsMax[i + 1], bars[i]);
        }
        int res = 0;
        for (int i=1; i<n - 1; i++) {
            res += (min(leftBarsMax[i], rightBarsMax[i]) - bars[i]);
        }
        return res;
    }
};