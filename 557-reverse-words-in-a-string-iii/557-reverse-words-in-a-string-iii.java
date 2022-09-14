class Solution {
    public String reverseWords(String s) {
        String arr[] = s.split(" ");
        String result = "";
        for(int i = 0; i<arr.length; i++){
            int temp = arr[i].length() - 1;
            while(temp >= 0){
                result += arr[i].charAt(temp);
                temp--;
            }
            if(i < arr.length - 1){
                result += " ";
            }
        }
        return result;
    }
}