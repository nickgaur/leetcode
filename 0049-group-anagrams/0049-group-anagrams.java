class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        // List<List<String>> result = new ArrayList<>();
        // String[] copiedStrs = strs.clone();
        // HashSet<String> set = new HashSet<>();

        // for (int i = 0; i < copiedStrs.length; i++) {
        //     char[] chars = copiedStrs[i].toCharArray();
        //     Arrays.sort(chars);
        //     String str = new String(chars);
        //     copiedStrs[i] = str;
        //     set.add(copiedStrs[i]);
        // }
        // for (String str : set) {
        //     List<String> list = new ArrayList<>();
        //     for (int i = 0; i < copiedStrs.length; i++) {
        //         if (str.equals(copiedStrs[i])) {
        //             list.add(strs[i]);
        //         }
        //     }
        //     result.add(list);
        // }

        // return result;


        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String str = new String(charArray);
            if (!map.containsKey(str)) {
                map.put(str, new ArrayList<>());
            }
            map.get(str).add(strs[i]);
        }
        List<List<String>> result = new ArrayList<>();
        for (String str : map.keySet()) {
            result.add(map.get(str));
        }
        return result;
    }
}