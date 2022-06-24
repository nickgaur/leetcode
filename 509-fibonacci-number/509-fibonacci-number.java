class Solution {
    public int fib(int n) {
        int a = 0;
        int b = 1;
        int c = 1;
        while(n > 1){
                c = a + b;
                a = b;
                b = c;
            n--;
        }
        return (n == 0) ? 0 : c;
    }
}