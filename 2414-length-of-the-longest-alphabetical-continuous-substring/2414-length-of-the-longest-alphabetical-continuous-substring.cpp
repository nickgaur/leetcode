class Solution {
public:
    int longestContinuousSubstring(string s) {
        int count{1};
        int res{1};
        for(int i=1; i<s.length(); i++){
            if(s[i] - s[i-1] == 1){
                count++;
                res = max(res, count);
            }
            else{
                count = 1;
            }
        }
        return res;
    }
};