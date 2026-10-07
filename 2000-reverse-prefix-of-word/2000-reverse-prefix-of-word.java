class Solution {
    public String reversePrefix(String word, char ch) {
        int n = word.length();
        int i;
        for(i = 0; i < n; i++){
            if(word.charAt(i) == ch){
                break;
            }
        }
        if(i == n){
            return word;
        }
        StringBuilder sb = new StringBuilder();
        for(int j =i; j >= 0; j--){
            sb.append(word.charAt(j));
        }
        sb.append(word.substring(i+1, n));
        return sb.toString();
    }
}