class Solution {

    static void swap(int arr[], int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length - 1;
        int count = 0;
        while(left <= right){
            if(nums[left] == val){
                swap(nums, left, right);
                right--;
            }
            else{
                left++;
            }
        }
        for(int i =0;i < nums.length; i++){
            if(nums[i] == val){
                return count;
            }
            count++;
        }
        return count;
    }
}