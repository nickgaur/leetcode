class Solution {
    // MEMOIZATION
    // static int fib(int n, int cache[]){
    //     if(n == 0 || n == 1){
    //         return n;
    //     }
    //     if(cache[n] != 0){
    //         return cache[n];
    //     }
    //     int res = fib(n-1, cache) + fib(n-2, cache);
    //     cache[n] = res;
    //     return res;
    // }
    
    // TABULATION
    static int tabulation(int n){
        int cache[] = new int[n+1];
        cache[0] = 1;
        cache[1] = 1;
        for(int i=2; i < cache.length; i++){
            cache[i] = cache[i-1] + cache[i-2];
        }
        return cache[n];
    }
    public int climbStairs(int n) {
        // int cache[] = new int[n+2];
        // return fib(n + 1, cache);
        return tabulation(n);
    }
}