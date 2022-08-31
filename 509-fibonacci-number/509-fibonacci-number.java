class Solution {
    static int solve(int n, int cache[]){
        if(n <= 1){
            return n;
        }
        else if(cache[n] != 0){
            return cache[n];
        }
        int res = solve(n-2, cache) + solve(n-1, cache);
        cache[n] = res;
        return res;
    }
    public int fib(int n) {
        int cache[] = new int[n+1];
        return solve(n, cache);
    }
}