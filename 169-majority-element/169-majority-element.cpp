class Solution {
public:
    int majorityElement(vector<int>& arr) {
        int res{0};
        int count{1};
        for(int i=1; i<arr.size(); i++){
            if(arr[i] == arr[res]){
                count++;
            }
            else {
                count--;
            }
            if(count == 0){
                res = i;
                count = 1;
            }
        }
        count = 0;
        for(int i=0; i<arr.size(); i++){
            if(arr[i] == arr[res]){
                count++;
            }
        }
        if(count > arr.size()/2);{
            return arr[res];
        }
        return -1;
    }
};