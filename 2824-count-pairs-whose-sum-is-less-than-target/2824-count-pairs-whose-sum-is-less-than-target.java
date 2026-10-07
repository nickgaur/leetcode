class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int n = nums.size();
        int res = 0;
        for(int i = 0 ; i < n ; i++){
            int sum = 0;
            for(int j = i+1; j < n; j++){
                sum = nums.get(i) + nums.get(j);
                if(sum < target){
                    res++;
                }
            }
        }
        return res;
    }
}