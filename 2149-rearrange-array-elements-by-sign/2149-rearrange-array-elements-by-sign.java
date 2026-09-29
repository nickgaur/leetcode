class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int neg[] = new int[n/2];
        int pos[] = new int[n/2];
        int j = 0;
        int k = 0;
        for(int i = 0 ; i < n; i++){
            if(nums[i] < 0){
                neg[j++] = nums[i];
            }
            else{
                pos[k++] = nums[i];
            }
        }

        int t =0;
        for(int i = 0 ; i < n; i+=2){
            nums[i] = pos[t];
            nums[i+1] = neg[t];
            t++;
        }
        return nums;
    }
}