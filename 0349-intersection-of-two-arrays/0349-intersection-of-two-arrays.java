class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int m = nums1.length;
        int n = nums2.length;
        int i =0;
        int j = 0;
        int index = 0;
        ArrayList<Integer> result = new ArrayList<>();
        while(i < m && j < n){
            if(i > 0 && nums1[i] == nums1[i-1]){
                i++;
                continue;
            }
            else if(nums1[i] < nums2[j]){
                i++;
            }
            else if(nums1[i] > nums2[j]){
                j++;
            }
            else{
                result.add(nums1[i]);
                i++;
            }
        }
        int finalResult[] = new int[result.size()];
        for(int k = 0;k < result.size(); k++){
            finalResult[k] = result.get(k);
        }
        return finalResult;
    }
}