class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int temp{1};
        for(int i=0; i<nums.size()-1; i++){
            if(nums[i] != nums[i+1]){
                nums[temp] = nums[i+1];
                temp = temp + 1;
            }
        }
        return temp;
    }
};