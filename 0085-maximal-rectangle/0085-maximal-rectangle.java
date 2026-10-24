class Solution {

static int findMaxArea(int arr[]) {
        int n = arr.length;
        int res = 0;

        // BETTER APPROACH
        // TIME: O(3N)
        // SPACE: O(2N)
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

        // for (int i : ps) {
        // System.out.print(i + " ");
        // }
        // System.out.println();
        // for (int i : ns) {
        // System.out.print(i + " ");
        // }
        int area = 0;
        for (int i = 0; i < n; i++) {
            area = arr[i] * (ns[i] - ps[i] - 1);
            res = Math.max(res, area);
        }

        return res;

    }

    public int maximalRectangle(char[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int res = 0;
        int newMat[][] = new int[row][col];

        // FILLING ELEMENTS OF FIRST ROW AS IT IS
        for (int i = 0; i < col; i++) {
            newMat[0][i] = mat[0][i] - '0';
        }

        // FILLING ELEMENTS SUCH THAT THE CURRENT ELEMENT IS BASE OF HISTOGRAM
        for (int i = 1; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (mat[i][j] != '0') {
                    newMat[i][j] = (newMat[i - 1][j]) + (mat[i][j] - '0');
                }
                
            }
        }

        for (int i = 0; i < row; i++) {
            int area = findMaxArea(newMat[i]);
            res = Math.max(res, area);
        }
        return res;
    }
}