class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stk = new Stack<>();
        for(String str: ops){
            if(str.equals("+")){
                int prev = stk.pop();
                int sum = prev + stk.peek();
                stk.push(prev);
                stk.push(sum);
            }
            else if(str.equals("C")){
                stk.pop();
            }
            else if(str.equals("D")){
                int temp = stk.peek();
                stk.push(2 * stk.peek());
            }
            else {
                // int t = Integer.valueOf(str);
                stk.push(Integer.valueOf(str));
            }
        }
        int count = 0;
        for(int t: stk){
            count += t;
        }
        return count;
    }
}