class Solution {
    public String interpret(String command) {
        StringBuilder str = new StringBuilder();
        for(int i=0; i<command.length(); i++){
            if(command.charAt(i) == '(' && command.charAt(i+1) == ')'){
                str.append("o");
                i+=1;
            }
            else if(command.charAt(i) == '(' && command.charAt(i+1) == 'a'){
                str.append("al");
                i+=3;
            }
            else{
                str.append(command.charAt(i));
            }
        }
        return str.toString();
    }
}