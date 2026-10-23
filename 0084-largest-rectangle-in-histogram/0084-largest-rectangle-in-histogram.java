class Solution {
    public int largestRectangleArea(int[] arr) {
        int n = arr.length;
        int res = 0;
        // for(int i = 0 ; i < n; i++){
        //     int area = 0;
        //     int minValue = arr[i];
        //     int num = 1;
        //     for(int j = i; j < n; j++){
        //         minValue = Math.min(minValue, arr[j]);
        //         area = minValue * (num);
        //         num++;
        //         res = Math.max(res, area);
        //     }
        // }
        // return res;

        int ps[] = new int[n];
        int ns[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                ps[i] = -1;
                st.push(0);
            } else {
                while (!st.isEmpty() && arr[i] <= arr[st.peek()]) {
                    st.pop();
                }
                int psValue = st.isEmpty() ? -1 : st.peek();
                ps[i] = psValue;
                st.push(i);
            }
        }
        st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            if (i == n - 1) {
                ns[i] = i + 1;
                st.push(n - 1);
            } else {
                while (!st.isEmpty() && arr[i] <= arr[st.peek()]) {
                    st.pop();
                }
                int nsValue = st.isEmpty() ? n : st.peek();
                ns[i] = nsValue;
                st.push(i);
            }
        }

        
        int area = 0;
        for (int i = 0; i < n; i++) {
            area = arr[i] * (ns[i] - ps[i] - 1);
            res = Math.max(res, area);
        }

        return res;
    }
}