class Solution {
    public int[] twoSum(int[] arr, int target) {
        int result[] = new int[2];
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        // for (int i = 0; i < n; i++) {
        //     if(!map.containsKey(arr[i])){
        //         map.put(target - arr[i], i);
        //     }
        //     else{
        //         result[0] = map.get(arr[i]);
        //         result[1] = i;
        //     }
        // }
        // return result;
        for(int i = 0 ; i < n ; i++){
            if(map.containsKey(target - arr[i])){
                result[0] = map.get(target - arr[i]);
                result[1] = i;
                return result;
            }
            map.put(arr[i], i);
        }
return result;
    }
}