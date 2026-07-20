class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int temp[] = new int[n];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp[idx] = arr[i];
                idx++;
            }
            else{
                idx+=2;
            }
            if(idx >= n){
                break;
            }
        }
        idx = 0;
        for(int i: temp){
            arr[idx] = i;
            idx++;
        }
    }
}