class Solution {
public:
    bool search(vector<int>& arr, int target) {
        int low{0};
        int high = arr.size() - 1;
        while(low <= high){
            int mid = (high+low) / 2;
            if(arr[mid] == target){
                return true;
            }
            
            if((arr[low] == arr[mid]) && (arr[high] == arr[mid]))
            {
                low += 1;
                high -= 1;
            }

            
            // if left sorted
            else if(arr[low] <= arr[mid]){
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
        return false;
    }
};