class Solution {
public:
    bool isPalindrome(string s) {
        deque<char> deq;
        for(char ch: s){
            if(isalnum(ch)){
                deq.push_back(tolower(ch));
            }
        }
        while(deq.size() > 1){
            if(deq.front() != deq.back()){
                return false;
            }
            deq.pop_front();
            deq.pop_back();
        }
        
        return true;
    }
};