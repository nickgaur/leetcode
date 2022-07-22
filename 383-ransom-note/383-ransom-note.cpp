class Solution {
public:
    bool canConstruct(string ransomNote, string magazine) {
        if(ransomNote.length() > magazine.length()){
            return false;
        }
        map<char, int> m1;
        for(int i=0; i<magazine.length(); i++){
            m1[magazine[i]]++;
        }

        for(int i=0; i<ransomNote.length(); i++){
            if( m1[ransomNote[i]] == 0){
                return false;
            }
            m1[ransomNote[i]]--;
        }
        return true;
    }
};