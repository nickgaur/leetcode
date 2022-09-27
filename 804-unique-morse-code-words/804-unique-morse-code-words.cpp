class Solution {
public:
    int uniqueMorseRepresentations(vector<string>& words) {
        string arr[] = {
            ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        set<string> Set;
        for(auto word: words){
            string str = "";
            for(auto i: word){
                str += arr[i - 'a'];
            }
            Set.insert(str);
        }
        return Set.size();
    }
};