class Solution {
private:
    vector<int> reset(vector<int> vec, int index){
        vector<int> res(vec.size() - 1 );
        int t = 0;
        for(int i=0; i<vec.size(); i++){
            if(i != index){
                res[t] = vec[i];
                t++;
            }
        }
        return res;
    }

public:
    vector<vector<int>> permute(vector<int>& nums) {
        vector<vector<int>> result;
        
        // BASE CASE
        if(nums.size() == 0){
            vector<int> sample;
            result.push_back(sample);
            return result;
        }
        
        // SMALL PROBLEM
        for(int i=0; i<nums.size(); i++){
            int getElement{nums[i]};
            vector<int> newVec = reset(nums, i);
            vector<vector<int>> returnedVector = permute(newVec);
            for(vector<int> vec: returnedVector){
                vec.push_back(getElement);
                result.push_back(vec);
            }
        }
        return result;
    }
};