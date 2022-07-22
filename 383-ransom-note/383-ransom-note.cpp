class Solution {
public:
    bool canConstruct(string ransomNote, string magazine) {
        if(ransomNote.length() > magazine.length()){
            return false;
        }
        map<char, int> m1;
        for(int i=0; i<magazine.length(); i++){
            if(m1[magazine[i]]){
                m1[magazine[i]]++;
            }
            else{
                m1[magazine[i]] = 1;
            }
        }

        for(int i=0; i<ransomNote.length(); i++){
            if( m1[ransomNote[i]] == 0){
                return false;
            }
            if(m1[ransomNote[i]] > 0){
                m1[ransomNote[i]]--;
            }
        }
        return true;
    }
};