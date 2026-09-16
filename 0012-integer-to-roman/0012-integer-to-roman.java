class Solution {
    public String intToRoman(int num) {
        String key[] = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        int values[] = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

        String res = "";
        for (int i = 0; i < key.length; i++) {
            while (num >= values[i]) {
                res += key[i];
                num -= values[i];
            }
        }
        return res;
        // while (num >= 1000) {
        //     res += "M";
        //     num = num - 1000;
        // }
        // while (num >= 900) {
        //     res += "CM";
        //     num = num - 900;
        // }
        // while (num >= 500) {
        //     res += "D";
        //     num = num - 500;
        // }
        // while (num >= 400) {
        //     res += "CD";
        //     num = num - 400;
        // }
        // while (num >= 100) {
        //     res += "C";
        //     num = num - 100;
        // }
        // while (num >= 90) {
        //     res += "XC";
        //     num = num - 90;
        // }
        // while (num >= 50) {
        //     res += "L";
        //     num = num - 50;
        // }
        // while (num >= 40) {
        //     res += "XL";
        //     num = num - 40;
        // }
        // while (num >= 10) {
        //     res += "X";
        //     num = num - 10;
        // }
        // while (num >= 9) {
        //     res += "IX";
        //     num = num - 9;
        // }
        // while (num >= 5) {
        //     res += "V";
        //     num = num - 5;
        // }
        // while (num >= 4) {
        //     res += "IV";
        //     num = num - 4;
        // }
        // while (num >= 1) {
        //     res += "I";
        //     num = num - 1;
        // }
        // return res;
    }
}