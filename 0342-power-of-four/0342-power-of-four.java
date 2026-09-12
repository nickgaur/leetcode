class Solution {
    public boolean isPowerOfFour(int n) {
        if(n == 1){
            return true;
        }
        int temp = 1;
        // while(temp <= n){
        //     if(temp == n){
        //         return true;
        //     }
        //     temp = temp * 4;
        // }
        while(n > 1 && n % 4 == 0){
            n = n / 4;
        }
        return n == 1;
    }
}