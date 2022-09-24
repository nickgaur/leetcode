class Solution {
public:
    uint32_t reverseBits(uint32_t n) {
        if(n <= 0) return 0;
        
        uint32_t ans  = 0;
        
        for(int i = 0; i < 32; i++){
            int temp = n&1;
            n = n>>1;
            ans = (ans<<1);
            ans = ans | temp;
        }
        return ans;
    }
};