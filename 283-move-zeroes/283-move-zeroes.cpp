class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int i{0};
        int j{0};
        while(i < nums.size() && j < nums.size()){
            if(nums.at(i) == 0 && nums.at(j) != 0){
                int temp = nums.at(i);
                nums.at(i) = nums.at(j);
                nums.at(j) = temp;
                i++;
                j++;
            }
            else if(nums.at(i) != 0 && nums.at(j) == 0){
                i++;
            }
            else {
                j++;
            }
        }
    }
};