class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int idx = 0;
        int count = 1;
        // String res = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < n; i++) {
            if(chars[i] == chars[i-1]){
                count++;
            }
            else{
                if(count > 1){
                    sb.append(String.valueOf(chars[i-1]) + count);
                }
                else{
                    sb.append(String.valueOf(chars[i-1]));
                }
                count = 1;
            }
        }
        if(count > 1){
           sb.append(String.valueOf(chars[n-1]) + count);
        }
        else{
            sb.append(String.valueOf(chars[n-1]));
        }
        
        for(int i = 0; i < sb.length(); i++){
            chars[i] = sb.charAt(i);
        }
        
        return sb.length();
    }
}