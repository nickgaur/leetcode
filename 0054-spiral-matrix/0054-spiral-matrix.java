class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        int m = arr.length; // 3
        int n = arr[0].length; // 4
        int top = 0;
        int right = n - 1; // 3
        int bottom = m - 1; // 2
        int left = 0;

        List<Integer> result = new ArrayList<>();

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                result.add(arr[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                result.add(arr[i][right]);
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(arr[bottom][i]);
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(arr[i][left]);
                }
                left++;
            }

        }
            return result;
    }
}