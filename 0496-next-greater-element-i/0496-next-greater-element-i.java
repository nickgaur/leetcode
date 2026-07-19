class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        int res[] = new int[nums1.length];
        Arrays.fill(res, -1);
        for (int i = 0; i < n; i++) {
            int t = nums1[i];
            int idx = i;
            for(int j = 0; j < m; j++){
                if(nums2[j] == t){
                    idx = j;
                    break;
                }
            }
            for (int j = idx; j < m; j++) {
                if(nums2[j] > t){
                    res[i] = nums2[j];
                    break;
                }
            }
        }
        return res;
    }
}
