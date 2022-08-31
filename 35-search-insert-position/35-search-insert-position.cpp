class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        size_t n{nums.size()};
        int low{0};
        unsigned long high{n - 1};
        if(target < nums[0]){
            return 0;
        }
        else if(target > nums[high]){
            return n;
        }
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(target < nums[mid]){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
};