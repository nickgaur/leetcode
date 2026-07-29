class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        if(n == 1){
            return intervals;
        }
        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));
        ArrayList<int[]> result = new ArrayList<>();

        int[] newInterval = intervals[0];
        result.add(newInterval);
        for (int i = 1; i < n; i++) {
            if (intervals[i][0] <= newInterval[1]) {
                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            } else {
                newInterval = intervals[i];
                result.add(newInterval);
            }
        }
        int[][] finalResult = new int[result.size()][2];
        int idx = 0;
        for(int arr[]: result){
            finalResult[idx] = arr;
            idx++;
        }
        return finalResult;
    }
}