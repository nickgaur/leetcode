class Solution {
    public List<String> generateParenthesis(int n) {
        return generateParenthesis2(n, "", 0, 0);
    }
    
    static List<String> generateParenthesis2(int n, String currString, int opening, int closing) {
        if (currString.length() == 2*n) {
            ArrayList<String> list = new ArrayList<>();
            list.add(currString);
            return list;
        }
        List<String> result = new ArrayList<>();
        List<String> finalResult = new ArrayList<>();
        if (opening < n) {
            List<String> returnedList = generateParenthesis2(n, currString + "(", opening + 1, closing);
            for(String elem: returnedList){
                result.add(elem);
            }
        }
        if (closing < opening) {
            List<String> returnedList2 = generateParenthesis2(n, currString + ")", opening, closing + 1);
            for(String elem: returnedList2){
                result.add(elem);
            }
        }
        for(String elem: result){
            finalResult.add(elem);
        }
        return result;
    }
}