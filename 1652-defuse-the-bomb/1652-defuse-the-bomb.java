class Solution {
    public int[] decrypt(int[] code, int k) {

        int n = code.length;
        int result[] = new int[n];
        // if (k == 0) {
        //     return result;
        // } else if (k > 0) {
        //     for (int i = 0; i < n; i++) {
        //         int sum = 0;
        //         for (int j = i + 1; j <= k + i; j++) {
        //             sum += code[j % n];
        //         }
        //         result[i] = sum;
        //     }
        //     return result;
        // }
        // else{
        //     k = -k;
        //     for(int i = 0; i < n; i++){
        //         int sum = 0;
        //         for(int j = i + n - k ; j < n+i; j++){
        //             sum += code[j%n];
        //         }
        //         result[i] = sum;
        //     }
        //     return result;
        // }
        if(k == 0){
            return result;
        }
        else if(k > 0){
            int sum = 0;
            for(int i = 1; i <= k; i++){
                sum += code[i];
            }
            result[0] = sum;
            for(int i = 1; i < n; i++){
                sum = sum - code[i] + code[(i+k) % n];
                result[i] = sum;
            }

        }
        else{
            int sum = 0;
            for(int i = n-1; i >= n + k; i--){
                sum += code[i];
            }
            result[0] = sum;
            for(int i = 1; i < n; i++){
                sum = sum - code[(n + k + i - 1) % n] + code[i-1];
                result[i] = sum;
            }
        }
            return result;
    }
}