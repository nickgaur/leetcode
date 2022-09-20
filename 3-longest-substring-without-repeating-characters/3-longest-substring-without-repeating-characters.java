class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 1){
            return 1;
        }
        int j = 0;
        HashMap<Character, Integer> mp = new HashMap<>();
        int count = 0;
        int res = 0;
        for(int i=0; i<s.length(); i++){
            if(mp.containsKey(s.charAt(i))){
                j = Math.max(j, mp.get(s.charAt(i)) + 1);
            }
            mp.put(s.charAt(i), i);
            res = Math.max(res, i - j + 1);
        }
        return res;
    }
}