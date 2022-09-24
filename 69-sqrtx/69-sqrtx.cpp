class Solution {
public:
    int mySqrt(int x) {
        long long low = 0;
        long long high = x;
        while(low <= high){
            long long mid = (low + high)/2;
            if(mid * mid == x || (mid*mid < x && (mid+1)*(mid+1) > x)){
                return mid;
            }
            else if(mid * mid > x) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return 0;
    }
};