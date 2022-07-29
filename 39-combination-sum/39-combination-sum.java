class Solution {
    static List<List<Integer>> solve(int[] candidates, int sum,int index, int target){
        List<List<Integer>> result = new ArrayList<>();
        // BASE CASE
        if(sum == target){
            result.add(new ArrayList<Integer>());
            return result;
        }
        
        // SMALL PROBLEM
        for(int i=index; i<candidates.length; i++){
            if(sum + candidates[i] <= target){
                List<List<Integer>> returnedList = solve(candidates,sum + candidates[i],i                    ,target);
            for(List<Integer> t: returnedList){
                t.add(candidates[i]);
                result.add(t);
            }
            }
        }
        return result;
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        return solve(candidates,0,0, target);
    }
}