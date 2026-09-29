class Solution {
    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void sortColors(int[] arr) {
        int n = arr.length;
        int j =0;
        int k = n-1;
        int i =0;
        while(i <= k){
            if(arr[i] == 0){
                swap(arr, i, j);
                i++;
                j++;
            }
            else if(arr[i] == 2){
                swap(arr, i, k);
                k--;
            }
            else{
                i++;
            }
        }
    }
}