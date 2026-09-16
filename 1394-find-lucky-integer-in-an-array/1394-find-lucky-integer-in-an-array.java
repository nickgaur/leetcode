class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int res = -1;
        for(int t: map.keySet()){
            if(map.get(t) == t){
            res = Math.max(res,t);
            }

            // System.out.println(t + " : " + map.get(t));
        }
        return res;
    }
}