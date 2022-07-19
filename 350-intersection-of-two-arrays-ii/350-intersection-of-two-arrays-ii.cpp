class Solution {
public:
    vector<int> intersect(vector<int>& nums1, vector<int>& nums2) {
        vector<int> res{};
        sort(nums1.begin(), nums1.end());
        sort(nums2.begin(), nums2.end());
        int p = 0;
        int q  = 0;
        while(p < nums1.size() && q < nums2.size()){
            if(nums1[p] == nums2[q]){
                res.push_back(nums1[p]);
                p++;
                q++;
            }
            else if(nums1[p] < nums2[q]){
                p++;
            }
            else{
                q++;
            }
        }
        return res;
    }
};