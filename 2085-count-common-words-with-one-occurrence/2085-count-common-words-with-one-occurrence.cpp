class Solution {
public:
    int countWords(vector<string>& words1, vector<string>& words2) {
        int count{0};
        map<string, int> map1;
        for(auto i: words1){
            map1[i]++;
        }
        map<string, int> map2;
        for(auto i: words2){
            map2[i]++;
        }
        for(auto i: words1){
            if(map1[i] == 1 && map2[i] == 1){
                count++;
                map1[i] = 0;
                map2[i] = 0;
            }
        }
        for(auto i: words2){
            if(map1[i] == 1 && map2[i] == 1){
                count++;
            }
        }
        return count;
    }
};