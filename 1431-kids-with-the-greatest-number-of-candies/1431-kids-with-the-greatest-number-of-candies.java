class Solution {
    static int findMax(int arr[], int n){
        int max = arr[0];
        for(int i=0;i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        int max = findMax(candies, n);
        List<Boolean> res = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(extraCandies + candies[i] >= max){
                res.add(true);
            }
            else {
                res.add(false);
            }
        }
        return res;
    }
}