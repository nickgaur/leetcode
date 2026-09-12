class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        String[] copiedStrs = strs.clone();
        HashSet<String> set = new HashSet<>();
        int n = strs.length;

        for (int i = 0; i < copiedStrs.length; i++) {
            char[] chars = copiedStrs[i].toCharArray();
            Arrays.sort(chars);
            String str = new String(chars);
            copiedStrs[i] = str;
            set.add(copiedStrs[i]);
        }
        // for(String s: copiedStrs){
        //     System.out.println(s);
        // }
        for (String str : set) {
            List<String> list = new ArrayList<>();
            for (int i = 0; i < copiedStrs.length; i++) {
                if (str.equals(copiedStrs[i])) {
                    list.add(strs[i]);
                }
            }
            result.add(list);
        }

        return result;
    }
}