class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int res = 0;
        int n = s.length();
        if(n == 1){
            return map.get(s.charAt(0));
        }

        for (int i = 0; i < s.length()-1; i++) {
            int currentCh = map.get(s.charAt(i));
            int nextCh = map.get(s.charAt(i + 1));
            if (currentCh < nextCh) {
                res = res + nextCh - currentCh;
                i++;
            } else {
                res = res + map.get(s.charAt(i));
            }
        }
        if(map.get(s.charAt(n-1)) <= map.get(s.charAt(n-2))){
            res = res + map.get(s.charAt(n-1));
        }

        return res;
    }
}