class Solution {
    static int [] reset(int[] arr, int index){
        int [] res = new int[arr.length - 1];
        int t = 0;
        for(int i=0; i<arr.length; i++){
            if(i != index){
                res[t] = arr[i];
                t++;
            }
        }
        return res;
    }
    
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        // BASE CASE
        if(nums.length == 0){
            result.add(new ArrayList<Integer>());
            return result;
        }
        
        // SMALL PROBLEM
        for(int i=0; i<nums.length; i++){
            int getElement = nums[i];
            int []newArr = reset(nums, i);
            List<List<Integer>> returnedList = permute(newArr);
            for(List<Integer> t: returnedList){
                t.add(getElement);
                result.add(t);
            }
        }
        return result;
    } 
}