class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        map<int, int> hashMap{};
        vector<int> vec{};
        for(int i=0; i<nums.size(); i++){
            int key{target - nums[i]};
            auto it = hashMap.find(key);
            if(it == hashMap.end()){
                hashMap[nums[i]] = i;
            }
            else{
                vec.push_back(hashMap[key]);
                vec.push_back(i);
                break;
            }
        }
        return vec;
    }
};