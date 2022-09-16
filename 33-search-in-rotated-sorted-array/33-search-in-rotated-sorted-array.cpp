class Solution {
public:
    int search(vector<int>& arr, int target) {
        int low{0};
        int high = arr.size() - 1;
        while(low <= high){
            int mid = low + (high-low) / 2;
            if(arr[mid] == target){
                return mid;
            }
            
            // if left sorted
            if(arr[low] <= arr[mid]){
                if(target >= arr[low] && target < arr[mid]){
                    high = mid - 1;
                }
                else {
                    low = mid + 1;
                }
            }
            
            // if right sorted
            else {
                if(target > arr[mid] && target <= arr[high]){
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
};