class Solution {
public:
    char findTheDifference(string s, string t) {
        int x = 0;
        if(s.length() < t.length()){
            int i;
            for(i=0; i<s.length(); i++){
                x ^= s[i];
                x ^= t[i];
            }
            for(;i<t.length(); i++){
                x ^= t[i];
            }
        }
        else{
            int i;
            for(i=0; i<t.length(); i++){
                x ^= s[i];
                x ^= t[i];
            }
            for(;i<s.length(); i++){
                x ^= s[i];
            }
        }
        
        return static_cast<char>(x);
    }
};