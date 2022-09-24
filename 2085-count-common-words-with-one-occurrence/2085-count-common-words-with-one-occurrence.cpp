class Solution {
public:
    int countWords(vector<string>& words1, vector<string>& words2) {
        int count{0};
        unordered_map<string, int> map1;
        for(auto i: words1){
            map1[i]++;
        }
        unordered_map<string, int> map2;
        for(auto i: words2){
            map2[i]++;
        }
        for(auto i: map1){
            if(map1[i.first] == 1 && map2[i.first] == 1){
                count++;
                map1[i.first] = 0;
                map2[i.first] = 0;
            }
        }
        for(auto i: map2){
            if(map1[i.first] == 1 && map2[i.first] == 1){
                count++;
            }
        }
        return count;
    }
};