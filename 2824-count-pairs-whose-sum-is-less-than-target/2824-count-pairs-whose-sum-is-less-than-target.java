class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int n = nums.size();
        int res = 0;
        // for(int i = 0 ; i < n ; i++){
        //     int sum = 0;
        //     for(int j = i+1; j < n; j++){
        //         sum = nums.get(i) + nums.get(j);
        //         if(sum < target){
        //             res++;
        //         }
        //     }
        // }

        // ---------------------
        Collections.sort(nums);
        int i = 0;
        int j = n-1;

        while(i < j){
            int sum = nums.get(i) + nums.get(j);
            if(sum < target){
                res = res + (j - i);
                i++;
            }
            else{
                j--;
            }
        }
        return res;
    }
}