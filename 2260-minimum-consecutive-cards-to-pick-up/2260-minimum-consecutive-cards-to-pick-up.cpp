class Solution {
public:
    int minimumCardPickup(vector<int>& cards) {
        map<int, int> mp;
        int res = INT_MAX;
        for(int i = 0; i<cards.size(); i++){
            if(mp[cards[i]]){
                res = min(res, i + 2 - mp[cards[i]]);
            }
            mp[cards[i]] = i + 1;
        }
        return res != INT_MAX ? res : -1;
    }
};