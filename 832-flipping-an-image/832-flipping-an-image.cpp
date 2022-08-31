class Solution {
public:
    vector<vector<int>> flipAndInvertImage(vector<vector<int>>& image) {
        int n = image.size();
        for(int i=0; i < n; i++){
            int low{0};
            int high{n-1};
            while(low <= high){
                int temp = image[i][low] ^ 1;
                image[i][low] = image[i][high] ^ 1;
                image[i][high] = temp;
                low++;
                high--;
            }
        }
        return image;
    }
};