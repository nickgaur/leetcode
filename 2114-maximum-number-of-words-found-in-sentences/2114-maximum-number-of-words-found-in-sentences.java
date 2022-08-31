class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = -1;
        for(String str: sentences){
            String arr[] = str.split(" ");
            if(arr.length > max){
                max = arr.length;
            }
        }
        return max;
    }
}