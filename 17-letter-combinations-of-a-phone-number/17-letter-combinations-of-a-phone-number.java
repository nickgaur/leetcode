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
    
    public List<String> letterCombinations(String digits){
        if(digits.length() == 0){
            return new ArrayList<>();    
        }
        return letterCombinations2(digits);
    }
    
    public List<String> letterCombinations2(String digits) {
        List<String> finalList = new ArrayList<>();
        
        if(digits.length() == 0){
            finalList.add("");
            return finalList;
        }
        int firstLetter = digits.charAt(0) - '0';
        String remString = digits.substring(1);
        List <String> returnedList = letterCombinations2(remString);
        for(String str: returnedList){
            for(int i=0; i < (keys[firstLetter]).length(); i++){
                finalList.add(keys[firstLetter].charAt(i) + str);
            }
        }
        return finalList;
    }
}