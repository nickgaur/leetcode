class Solution {
public:
    int maxDepth(string s) {
        int opening{0};
        int closing{0};
        int maxDepth = 0;
        for(int i=0; i<s.length(); i++){
            if(s[i] == '('){
                opening++;
            }
            else if(s[i] == ')'){
                maxDepth = max(opening - closing, maxDepth);
                closing++;
            }
        }
        return maxDepth;
    }
};