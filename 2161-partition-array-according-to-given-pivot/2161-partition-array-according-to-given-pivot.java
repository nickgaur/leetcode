class Solution {
    
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int result[] = new int[n];
        int j =n-1;
        int left = 0;
        int right = n-1;
        int i = 0;

        while(i < n){
            if(nums[i] < pivot){
                result[left] = nums[i];
                left++;
            }
            if(nums[j] > pivot){
                result[right] = nums[j];
                right--;
            }
                i++;
                j--;
        }
        for(i = left; i <= right; i++){
            result[i] = pivot;
        }

        // ======================
        // int idx = 0;
        // for(int i = 0 ; i < n; i++){
        //     if(nums[i] < pivot){
        //         arr[idx] = nums[i];
        //         idx++;
        //     }
        // }
        // for(int i = 0 ; i < n; i++){
        //     if(nums[i] == pivot){
        //         arr[idx] = nums[i];
        //         idx++;
        //     }
        // }
        // for(int i = 0 ; i < n; i++){
        //     if(nums[i] > pivot){
        //         arr[idx] = nums[i];
        //         idx++;
        //     }
        // }
        
        return result;
    }
}