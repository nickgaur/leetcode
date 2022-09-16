class Solution {
    public boolean search(int[] arr, int target) {
        Arrays.sort(arr);
        int low=0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = (high+low) / 2;
            if(arr[mid] == target){
                return true;
            }
            
            if(target < arr[mid]){
                high = mid - 1;
            }
            else {
                low = low + 1;
            }
        }
        return false;
    }
}