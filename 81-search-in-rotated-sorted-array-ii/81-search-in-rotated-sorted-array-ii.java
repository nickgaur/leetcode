class Solution {
    public boolean search(int[] arr, int target) {
        // Arrays.sort(arr);
        // int low=0;
        // int high = arr.length - 1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
//         while(low <= high){
//             int mid = (high+low) / 2;
//             if(arr[mid] == target){
//                 return true;
//             }
            
//             // if left sorted
//             if(arr[low] < arr[mid]){
//                 if(target >= arr[low] && target < arr[mid]){
//                     high = mid - 1;
//                 }
//                 else {
//                     low = mid + 1;
//                 }
//             }
            
//             // if right sorted
//             else {
//                 if(target > arr[mid] && target <= arr[high]){
//                     low = mid + 1;
//                 }
//                 else {
//                     high = mid - 1;
//                 }
//             }
//         }
//         return false;
    }
}