class Solution {
    public int addDigits(int num) {
        int res = 0;
        if(num == 0){
            return 0;
        }
        do{
            res = 0;
            while(num > 0){
                int lastDigit = num % 10;
                res = res + lastDigit;
                num = num / 10;
            }
            if(res <= 9){
                return res;
            }
            // System.out.println(res);
            num = res;
            // System.out.println(num);
        }while(res > 9);
        return res;
    }
}