class Solution {
    static void reverseArr(int arr[], int i, int j){
        int low = i;
        int high = j-1;
        while(low < high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverseArr(nums, 0, n - k);
        reverseArr(nums, n-k, n);
        reverseArr(nums, 0, n);
    }
}