class Solution {
public:
    bool isHappy(int n) {
        if(n == 1){
            return true;
        }
        int t = n;
        
        while(t > 3){
            int sum {0};
            while(t > 0){
                sum += pow(t % 10, 2);
                t /= 10;
            }
            if(sum == 1){
                return true;
            }
            if(sum == 4){
                return false;
            }
            t = sum;
        }
        return false;
    }
};