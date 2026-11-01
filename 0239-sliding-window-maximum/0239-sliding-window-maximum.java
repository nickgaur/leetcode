class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        int n = arr.length;
        int result[] = new int[n - k + 1];

        // BRUTEFORCE APPROACH
        // for(int i = 0 ; i <  n-k+1 ;i++){
        //     int max = arr[i];
        //     for(int j = i + 1; j < i+k; j++){
        //         max = Math.max(max, arr[j]);
        //     }
        //     result[i] = max;
        // }

        // return result;

        // EFFICIENT APPROACH
        Deque<Integer> d = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            while (!d.isEmpty() && arr[i] >= arr[d.peekLast()]) {
                d.pollLast();
            }
            
            d.offerLast(i);
            
        }
        int index =0;
        for (int i = k; i < n; i++) {
            result[index++] = arr[d.peekFirst()];
            while (!d.isEmpty() && d.peekFirst() <= i - k) {
                d.pollFirst();
            }
            while (!d.isEmpty() && arr[i] >= arr[d.peekLast()]) {
                d.pollLast();
            }
            d.offerLast(i);
        }
        // for(int t: d){
        //     System.out.println("T: " + t);
        // }
        result[index] = arr[d.pollFirst()];
        return result;
    }
}