class Solution {
public:
    char findTheDifference(string s, string t) {
        int x = 0;
        for(int i=0; i<s.length(); i++){
            x ^= s[i];
        }
        for(int i=0; i<t.length(); i++){
            x ^= t[i];
        }
        return static_cast<char>(x);
    }
};