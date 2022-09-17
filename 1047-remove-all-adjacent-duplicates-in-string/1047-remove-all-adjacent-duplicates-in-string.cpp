class Solution {
public:
    string removeDuplicates(string s) {
        vector<char> vec;
        for(int i=0; i<s.length(); i++){
            if(vec.size() == 0 || vec.back() != s[i]){
                vec.push_back(s[i]);
            }
            else if(vec.back() == s[i]){
                vec.pop_back();
            }
        }
        string res="";
        for(auto t: vec){
            res += t;
        }
        return res;
    }
};