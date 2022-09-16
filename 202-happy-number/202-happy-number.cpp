class Solution {
public:
    bool isHappy(int n) {
        map<int, int> mp;
        while(n > 0){
            int sum {0};
            while(n > 0){
                sum += pow(n % 10, 2);
                n /= 10;
            }
            if(sum == 1){
                return true;
            }
            if(mp[sum]){
                return false;
            }
            mp[sum]++;
            n = sum;
        }
        return true;
    }
};