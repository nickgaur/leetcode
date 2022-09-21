class Solution {
public:
    
    vector<string> solve(string s, int i){
        vector<string> result;
        if(i == s.length()){
            result.push_back("");
            return result;
        }
        string res{""};        
        if(isalpha(s[i])){
            char ch = tolower(s[i]);
            vector<string>returnedList = solve(s, i+1);
            for(auto t: returnedList){
                res = ch + t;
                result.push_back(res);
            }
            
            ch = toupper(s[i]);
            vector<string>returnedList2 = solve(s, i+1);
            for(auto t: returnedList2){
                res = ch + t;
                result.push_back(res);
            }
        }
        else{
            char ch = s[i];
            res+=ch;
            vector<string>returnedList = solve(s, i+1);
            for(auto t: returnedList){
                res = ch + t;
                result.push_back(res);
            }
        }
        
        return result;
    }
    
    vector<string> letterCasePermutation(string s) {
        return solve(s, 0);
    }
};