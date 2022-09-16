class Solution {
public:
    int strStr(string haystack, string needle) {
        if(needle.length() > haystack.length()){
            return -1;
        }
        int lengthOfNeedle = needle.length();
        int result{-1};
        for(int i=0; i<haystack.length(); i++){
            if(needle == haystack.substr(i, lengthOfNeedle)){
                return i;
            }
        }
        return -1;
    }
};