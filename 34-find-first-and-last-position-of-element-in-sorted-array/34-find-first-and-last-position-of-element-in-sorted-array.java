class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low = 0 ;
        int high = nums.length - 1;
        int result[] = {-1,-1};
        
        // looking for upper limit
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] == target){
                if(mid == nums.length - 1 || nums[mid + 1] != nums[mid]){
                    result[1] = mid;
                    break;
                }
                else if(nums[mid] == nums[mid+1]) {
                    low = mid + 1;
                }
            }
            else if(target > nums[mid]){
                low = mid + 1;                
            }
            else {
                high = mid - 1;
            }
        }
        
        low = 0;
        high = nums.length - 1;
        
        // looking for lower limit
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] == target){
                if(mid == 0 || nums[mid - 1] != nums[mid]){
                    result[0] = mid;
                    break;
                }
                else {
                    high = mid - 1;
                }
            }
            else if(target > nums[mid]){
                low = mid + 1;                
            }
            else {
                high = mid - 1;
            }
        }
        return result;
    }
}