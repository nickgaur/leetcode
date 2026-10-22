class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int res[] = new int[nums1.length];
        // Arrays.fill(res, -1);
        // for (int i = 0; i < n; i++) {
        //     int t = nums1[i];
        //     int idx = i;
        //     for(int j = 0; j < m; j++){
        //         if(nums2[j] == t){
        //             idx = j;
        //             break;
        //         }
        //     }
        //     for (int j = idx; j < m; j++) {
        //         if(nums2[j] > t){
        //             res[i] = nums2[j];
        //             break;
        //         }
        //     }
        // }
        // return res;
        Stack<Integer> st = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        st.push(nums2[n-1]);
        map.put(nums2[n-1], -1);
        for(int i = n-2 ; i >= 0 ; i--){
            while(!st.isEmpty() && nums2[i] > st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                map.put(nums2[i], -1);
            }
            else{
                map.put(nums2[i], st.peek());
            }
            st.push(nums2[i]);
        }

        for(int i = 0; i < m; i++){
            res[i] = map.get(nums1[i]);
        }

        return res;
    }
}
