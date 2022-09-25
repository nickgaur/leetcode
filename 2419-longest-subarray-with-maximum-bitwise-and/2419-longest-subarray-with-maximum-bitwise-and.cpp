class Solution {
public:
    int longestSubarray(vector<int>& nums) {
        int maxElement{nums[0]};
        for(int i=1; i<nums.size(); i++){
            if(nums[i] > maxElement){
                maxElement = nums[i];
            }
        }
        int maxCount{0};
        int count{0};
        for(auto t: nums){
            if(t == maxElement){
                count++;
            }
            else{
                count = 0;
            }
            maxCount =  max(maxCount, count);
        }
        return maxCount;
    }
};