class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int prefixSum[] = new int[n];
        prefixSum[0] = height[0];
        int suffixSum[] = new int[n];
        suffixSum[n-1] = height[n-1];

        for(int i =1; i < n; i++){
            prefixSum[i] = Math.max(prefixSum[i-1], height[i]);
        }

        for(int i =n-2; i >= 0; i--){
            suffixSum[i] = Math.max(suffixSum[i+1], height[i]);
        }
        int res = 0;
        for(int i = 1;i < n-1; i++){
            res += Math.min(prefixSum[i], suffixSum[i]) - height[i];
        }
        return res;
    }
}