class Solution {
    public int canCompleteCircuit(int[] petrol, int[] dist) {
        int n = petrol.length;
        // int res = 0;
        // for (int i = 0; i < n; i++) {
        //     int rem = 0;
        //     if (petrol[i] >= dist[i]) {
        //         res = i;
        //         int j;
        //         for (j = i; j < i + n; j++) {
        //             rem = rem + petrol[j % n] - dist[j % n];
        //             if(rem < 0){
        //                 break;
        //             }
        //         }
        //         if(j == i+n){
        //             return res;
        //         }
        //     }
        // }
        // return -1;

        int total_petrol = 0;
        int total_dist = 0;
        int curr_petrol = 0;
        int start = 0;
        for (int i = 0; i < n; i++) {
            total_petrol += petrol[i];
            total_dist += dist[i];
            curr_petrol = curr_petrol + petrol[i] - dist[i];
            if(curr_petrol < 0){
                curr_petrol = 0;
                start = i + 1;
            }
        }
            if(total_petrol < total_dist){
                return -1;
            }
        return start;
    }
}