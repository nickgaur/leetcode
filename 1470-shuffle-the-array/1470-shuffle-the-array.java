class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[] = new int[n*2];
        int i = 0;
        int j = n;
        while(i < nums.length){
            arr[i] = nums[n - j + i];
            arr[i+1] = nums[j];
            i+=2;
            j++;
        }
        return arr;
    }
}