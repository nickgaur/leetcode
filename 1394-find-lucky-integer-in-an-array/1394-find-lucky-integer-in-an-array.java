class Solution {
    public int findLucky(int[] arr) {
        int n = arr.length;
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for (int i = 0; i < n; i++) {
        //     map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        // }
        // int res = -1;
        // for(int t: map.keySet()){
        //     if(map.get(t) == t){
        //     res = Math.max(res,t);
        //     }

        //     // System.out.println(t + " : " + map.get(t));
        // }
        // return res;
        int temp[] = new int[501];
        int res = -1;
        for (int i = 0; i < n; i++) {
            temp[arr[i]]++;
            // if (temp[arr[i]] == arr[i]) {
            //     res = Math.max(res, arr[i]);
            // }
            // else if(temp[arr[i]] < arr[i] || temp[arr[i]] > arr[i]){
            //     res = -1;
            // }
        }
        for(int i = 1; i <= 500; i++){
            if(temp[i] == i){
                res = i;
            }
        }
        return res;
    }
}