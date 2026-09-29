class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        // int k = 0;
        List<List<Integer>> result = new ArrayList<>();
        // HashMap<List<Integer>> map = new HashMap<>();
        Arrays.sort(nums);

        // int k = 0;        
        for (int i = 0; i < n - 2; i++) {
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
            if(j > i + 1 && nums[j] == nums[j-1]){j++;continue;}
            // if(k < n-1 && nums[k] == nums[k+1])
                int temp = nums[j] + nums[k];
                List<Integer> list = new ArrayList<>();
                if (temp + nums[i] == 0) {
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    result.add(list);
                    j++;
                }
                else if(temp + nums[i] > 0){
                    k--;
                }
                else{
                    j++;
                }
            }
        }
        return result;
    }
}