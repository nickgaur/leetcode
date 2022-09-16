class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        string res = "";
        for(int i=0; i<strs[0].length(); i++){
            char temp = strs[0][i];
            for(int j=1; j<strs.size(); j++){
                if(strs[j][i] == temp){
                    continue;
                }
                else{
                    return res;
                }
            }
            res += temp;
        }
        return res;
    }
};