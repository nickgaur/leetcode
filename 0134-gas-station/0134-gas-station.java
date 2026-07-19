class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int totalGas = 0;
        int totalCost = 0;
        for(int i =0;i < n; i++){
            totalGas += gas[i];
            totalCost += cost[i];
        }
        if(totalGas < totalCost){
            return -1;
        }
        int startingPoint = 0;
        int currGas = 0;
        for (int i = 0; i < n; i++) {
            currGas = currGas + gas[i] - cost[i];
            if(currGas < 0){
                currGas = 0;
                startingPoint = i + 1;
            }
        }
        return startingPoint;
    }
}