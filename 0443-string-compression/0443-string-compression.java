class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int idx = 0;
        int count = 1;
        String res = "";
        for (int i = 1; i < n; i++) {
            if(chars[i] == chars[i-1]){
                count++;
            }
            else{
                if(count > 1){
                    res = res + String.valueOf(chars[i-1]) + count;
                }
                else{
                    res = res + String.valueOf(chars[i-1]);
                }
                count = 1;
            }
        }
        if(count > 1){
            res = res + String.valueOf(chars[n-1]) + count;
        }
        else{
            res += String.valueOf(chars[n-1]);
        }
        
        for(int i = 0; i < res.length(); i++){
            chars[i] = res.charAt(i);
        }
        
        return res.length();
    }
}