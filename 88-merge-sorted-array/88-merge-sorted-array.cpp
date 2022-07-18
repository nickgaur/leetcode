class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        // if(nums2.size() != 0){
            vector<int> res(m+n, 0);
            int first{0};
            int second{0};
            for(int i=0; i<m+n; i++){
                if(second != n && first < m){
                    if(nums1[first] < nums2[second]){
                        res[i] = nums1[first];
                        first++;
                    }
                    else{
                        res[i] = nums2[second];
                        second++;
                    }
                }
                else if(first < m){
                    res[i] = nums1[first];
                    first++;
                }
                else if(second < n){
                    res[i] = nums2[second];
                    second++;
                }
            }
            for(int i=0; i<m+n; i++){
                nums1[i] = res[i];
            // }
        }
    }
};