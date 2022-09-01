class Solution {
    static int fib(int n, int cache[]){
        if(n == 0 || n == 1){
            return n;
        }
        if(cache[n] != 0){
            return cache[n];
        }
        int res = fib(n-1, cache) + fib(n-2, cache);
        cache[n] = res;
        return res;
    }
    public int climbStairs(int n) {
        int cache[] = new int[n+2];
        return fib(n + 1, cache);
    }
}