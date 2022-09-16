class Solution {
    public int divisorSubstrings(int num, int k) {
        String str = String.valueOf(num);
        int count = 0;
        for(int i=0; i<=str.length()-k; i++){
            String t = str.substring(i, i + k);
            int temp = Integer.parseInt(str);
            int temp2 = Integer.parseInt(t);
            if(temp2 != 0 && temp % temp2 == 0){
                count++;
            }
            str = String.valueOf(num);
        }
        return count;
            
    }
}