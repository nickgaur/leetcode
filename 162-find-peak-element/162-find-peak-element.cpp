class Solution {
public:
    int findPeakElement(vector<int>& nums) {
//         int low{0};
//         int high{nums.size()-1};
//         if(arr[0] > arr[1]){
            
//         }
//         naive
        int n = nums.size();
        if(n == 1){
            return 0;
        }
        if(nums[0] > nums[1]){
            return 0;
        }
        else if(nums[n - 1] > nums[n - 2]){
            return n - 1;
        }
        for(int i=1; i<nums.size() - 1; i++){
            if(nums[i] > nums[i-1] && nums[i] > nums[i+1]){
                return i;
            }
        }
        return 0;
    }
};