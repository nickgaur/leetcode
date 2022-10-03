class Solution {
public:
    int cache[31][1001];
    long mod = 1e9+7;
    int solve(int n, int k, int target){
        if(n < 0 || target < 0){
            return 0;
        }
        if(n == 0 && target == 0){
            return 1;
        } 
        if(cache[n][target] != -1){
            return cache[n][target];
        }
        int res = 0;
        for(int j=1; j <= k; j++){
            res = (res + solve(n-1, k, target - j)) % mod;
        }
        return cache[n][target] = res;
    }
    int numRollsToTarget(int n, int k, int target) {
        memset(cache,-1,sizeof(cache));
        return solve(n, k, target);
    }
};