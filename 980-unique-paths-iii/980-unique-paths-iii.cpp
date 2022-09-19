class Solution {
public:
    
    int result = 0;
    
    void solve(vector<vector<int>> grid,int startRow, int startCol, int temp){
        if(startRow < 0 || startCol < 0 || startRow >= grid.size() || startCol >= grid[0].size() || grid[startRow][startCol]==1 || grid[startRow][startCol] == -1 || grid[startRow][startCol] == -100 ){
            return;
        }
        
        if(grid[startRow][startCol] == 2){
            if(temp == 0){
                result++;
                return;
            }
            return;
        }        
        
        grid[startRow][startCol] = -100;
        solve(grid, startRow, startCol + 1,temp - 1);
        solve(grid, startRow, startCol - 1,temp - 1);
        solve(grid, startRow + 1, startCol,temp - 1);
        solve(grid, startRow - 1, startCol,temp - 1);
        
        grid[startRow][startCol] = 0;
    }
    
    int uniquePathsIII(vector<vector<int>>& grid) {
        int startRow = 0;
        int startCol = 0;
        int temp = 0;
        for(int i=0; i<grid.size(); i++){
            for(int j = 0; j<grid[i].size(); j++){
                if(grid[i][j] == 1){
                    startRow = i;
                    startCol = j;
                }
                else if(grid[i][j] == 0){
                    temp++;
                }
            }
        }
        solve(grid, startRow, startCol + 1,temp);
        solve(grid, startRow, startCol - 1,temp);
        solve(grid, startRow + 1, startCol,temp);
        solve(grid, startRow - 1, startCol,temp);
        return result;
    }
};