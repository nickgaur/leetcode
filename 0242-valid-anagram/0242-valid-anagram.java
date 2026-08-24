class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        // char charS[] = s.toCharArray();
        // char charT[] = t.toCharArray();
        // Arrays.sort(charS);
        // Arrays.sort(charT);
        // for(int i = 0; i < s.length(); i++){
        //     if(charS[i] != charT[i]){
        //         return false;
        //     }
        // }


        int arr[] = new int[256];
        for(int i = 0; i < s.length(); i++){
            arr[s.charAt(i)]++;
            arr[t.charAt(i)]--;
        }

        for(int i = 0;i < s.length(); i++){
            if(arr[s.charAt(i)] != 0){
                return false;
            }
        }
        return true;
    }
}