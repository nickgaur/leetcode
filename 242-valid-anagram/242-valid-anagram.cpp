class Solution {
public:
    bool isAnagram(string s, string t) {
        if(s.length() != t.length()){
            return false;
        }
        map<char, int> hashmap;
        for(int i=0; i<s.length(); i++){
            auto it = hashmap.find(s[i]);
            if(it != hashmap.end()){
                int ch = hashmap[s[i]];
                hashmap[s[i]] = ch + 1;
            }
            else{
                hashmap[s[i]] = 1;
            }
        }
        for(int i=0; i<t.length(); i++){
            auto it = hashmap.find(t[i]);
            if(it != hashmap.end()){
                int ch = hashmap[t[i]];
                if(ch){
                    hashmap[t[i]] = ch - 1;    
                }
                else {
                    return false;
                }
            }
            else{
                return false;
            }
        }
        return true;
    }
};