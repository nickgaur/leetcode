class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        generateParenthesis2(n, "", 0, 0, list);
        return list;
    }
    
    static void generateParenthesis2(int n, String currString, int opening, int closing, List<String> list) {
        if (currString.length() == 2*n) {
            list.add(currString);
            return ;
        }
        if (opening < n) {
            generateParenthesis2(n, currString + "(", opening + 1, closing, list);
        }
        if (closing < opening) {
            generateParenthesis2(n, currString + ")", opening, closing + 1, list);
        }
    }
}