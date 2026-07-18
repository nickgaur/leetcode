class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int res = numBottles;
        while (numBottles >= numExchange) {
            int refillBottles = numBottles / numExchange;
            int remainingBottles = numBottles % numExchange;
            res = res + refillBottles;
            numBottles  = refillBottles + remainingBottles;
        }
        return res;
    }
}