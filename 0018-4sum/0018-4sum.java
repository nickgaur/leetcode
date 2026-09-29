class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < n - 2; j++) {
                if(j > i + 1 && nums[j] == nums[j-1]){
                    continue;
                }
                long temp = nums[i] + nums[j];
                int k = j + 1;
                int l = n - 1;
                while (k < l) {
                    if(k > j + 1 && nums[k] == nums[k-1]){
                        k++;
                        continue;

                    }
                    long sum = nums[k] + nums[l];
                    if (sum + temp == target) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        list.add(nums[l]);
                        result.add(list);
                        k++;
                    } else if (sum + temp > target) {
                        l--;
                    } else {
                        k++;
                    }
                }
            }

        }
        return result;
    }
}