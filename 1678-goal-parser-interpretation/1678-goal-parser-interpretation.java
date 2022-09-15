class Solution {
    public String interpret(String command) {
        String str = command.replace("()", "o");
        str = str.replace("(","");
        str = str.replace(")","");
        return str;
    }
}