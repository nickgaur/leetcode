class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        Stack<Character> stack = new Stack<>();

        HashMap<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(')', '(');
        map.put(']', '[');

        for (int i = 0; i < n; i++) {
            char singleChar = s.charAt(i);
            if (map.containsKey(singleChar)) {
                if (stack.empty()) {
                    return false;
                } else {
                    char topValue = stack.pop();
                    if (map.get(singleChar) != topValue) {
                        return false;
                    }
                }
            } else {
                stack.push(singleChar);
            }
        }

        return stack.isEmpty() ? true : false;
    }
}