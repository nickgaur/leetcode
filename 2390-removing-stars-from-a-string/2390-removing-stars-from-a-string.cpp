class Solution {
public:
    string removeStars(string s) {
        vector<char> vec;
        for(char i: s){
            if(i == '*'){
                vec.pop_back();
            }
            else {
                vec.push_back(i);
            }
        }
        string result{""};
        for(auto t: vec){
            result += t; 
        }
        return result;
    }
};