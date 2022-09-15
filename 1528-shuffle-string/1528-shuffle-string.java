class Solution {
    public String restoreString(String s, int[] indices) {
        // StringBuilder result = new StringBuilder();
        char arr[] = new char[indices.length];
        for(int i=0; i<indices.length; i++){
            arr[indices[i]] = s.charAt(i);
        }
        String result="";
        for(char ch: arr){
            result += ch;
        }
        return result;
    }
}