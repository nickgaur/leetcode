class Solution {
    public int[] decrypt(int[] code, int k) {

        int n = code.length;
        int result[] = new int[n];
        if (k == 0) {
            return result;
        } else if (k > 0) {
            for (int i = 0; i < n; i++) {
                int sum = 0;
                for (int j = i + 1; j <= k + i; j++) {
                    sum += code[j % n];
                }
                result[i] = sum;
            }
            return result;
        }
        else{
            for(int i = 0; i < n; i++){
                int sum = 0;
                for(int j = i + n + k ; j < n+i; j++){
                    sum += code[j%n];
                }
                result[i] = sum;
            }
            return result;
        }
        
    }
}