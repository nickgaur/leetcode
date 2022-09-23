class Solution {
public:
    int solve(const vector<vector<int>> &triangle, int col, int row, vector<vector<int>> &cache){
        
        if(row < triangle.size() && col == triangle[row].size()){
            return INT_MAX;
        }
        if(row == triangle.size()){
            return 0;
        }
        if(cache[row][col] != -1){
            return cache[row][col];
        }
        long a = solve(triangle, col, row + 1, cache) + triangle[row][col];

        long b = solve(triangle, col + 1, row + 1, cache) + triangle[row][col+1];


        cache[row][col] = min(a,b);
        return min(a, b);
    }
    
    int minimumTotal(vector<vector<int>>& triangle) {
        
        if(triangle.size() == 1){
            return triangle[0][0];
        }
        
        int n = triangle.size();
        
        vector<vector<int>> cache(n, vector<int> (n, -1));
        
        return triangle[0][0] + solve(triangle, 0, 1, cache);
    }
};