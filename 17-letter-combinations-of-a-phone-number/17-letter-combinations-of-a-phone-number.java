class Solution {
    static String keys[] = {
            "",
            "",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz" };
static List<String> letterCombinations(String digits){
    if(digits.length() == 0) {
        List<String> list = new ArrayList<>();
        return list;
    }
    List<String> result = letterCombinations2(digits);
    return result;
}
    
    static List<String> letterCombinations2(String digits) {

        if(digits.length() == 0){
            List<String> list = new ArrayList<>();
            list.add("");
            return list;
        }

        char singleChar = digits.charAt(0);
        int digit = singleChar - '0';
        String strKeys = keys[digit];
        String remString = digits.substring(1);
        List<String> result = new ArrayList<>();
        for(int i=0; i<strKeys.length(); i++){
            List<String> returnedList = letterCombinations2(remString);
            for(String elem: returnedList){
                // System.out.println(elem);
                result.add(strKeys.charAt(i) + elem);
            }
        }
        return result;
    }
}