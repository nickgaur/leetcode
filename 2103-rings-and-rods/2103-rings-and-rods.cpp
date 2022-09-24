class Solution {
public:
    int countPoints(string rings) {
        int red[10]{};
        int blue[10]{};
        int green[10]{};
        
        for(int i=0; i<rings.length(); i+=2){
            if(rings[i] == 'R'){
                red[rings[i+1] - '0']++;
            }
            else if(rings[i] == 'G'){
                green[rings[i+1] - '0']++;
            }
            else if(rings[i] == 'B'){
                blue[rings[i+1] - '0']++;
            }
        }
        int count{0};
        for(int i=0; i<10; i++){
            if(red[i] && blue[i] && green[i]){
                count++;
            }
        }
        return count;
    }
};