class Solution {
public:
    int firstUniqChar(string s) {
        map <char, int> hashmap;
        for(int i=0; i<s.length(); i++){
            if(hashmap[s[i]]){
                hashmap[s[i]] = hashmap[s[i]] + 1;
            }
            else{
                hashmap[s[i]] = 1;
            }
        }
        for(int i=0; i<s.length(); i++){
            if(hashmap[s[i]] == 1){
                return i;
            }
        }
        return -1;
    }
};