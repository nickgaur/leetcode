class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stk = new Stack<>();
        for(int i=0; i < operations.length; i++){
            if(operations[i].length() != 1){
                int t = Integer.parseInt(operations[i]);
                stk.push(t);
            }
            else{
                char ch = operations[i].charAt(0);
                if(Character.isDigit(ch)){
                    int t = Integer.parseInt(operations[i]);
                    stk.push(t);
                }
                else if(ch == 'C'){
                    stk.pop();
                }
                else if(ch == 'D'){
                    int temp = stk.peek();
                    stk.push(2*temp);
                }
                else {
                    int prev = stk.peek();
                    stk.pop();
                    int prev2 = stk.peek();
                    stk.push(prev);
                    stk.push(prev + prev2);
                }
            }
        }
        int count = 0;
        for(int t: stk){
            count += t;
        }
        return count;
    }
}