class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int arr[] = new int[n];
        int idx = 0;
        for(int i = 0 ; i < n; i++){
            if(nums[i] < pivot){
                arr[idx] = nums[i];
                idx++;
            }
        }
        for(int i = 0 ; i < n; i++){
            if(nums[i] == pivot){
                arr[idx] = nums[i];
                idx++;
            }
        }
        for(int i = 0 ; i < n; i++){
            if(nums[i] > pivot){
                arr[idx] = nums[i];
                idx++;
            }
        }
        
        return arr;
    }
}