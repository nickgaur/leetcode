class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        for(int i=0;i <matrix.size(); i++){
            if(matrix[i][0] <= target && matrix[i][matrix[i].size() - 1] >= target){
                int low = 0;
                int high = matrix[i].size() - 1;
                while(low <= high){
                    int mid = (low + high)/2;
                    if(matrix[i][mid] == target){
                        return true;
                    }
                    else if(target > matrix[i][mid]){
                        low = mid + 1;
                    }
                    else{
                        high = mid - 1;
                    }
                }
            }
        }
        return false;
    }
};