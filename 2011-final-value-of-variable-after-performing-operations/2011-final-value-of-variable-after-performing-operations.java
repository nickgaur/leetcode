class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int res = 0;
        for(String str: operations){
            if(str.charAt(1) == '+'){
                res++;
            }
            else if(str.charAt(1) == '-'){
                res--;
            }
        }
        return res;
    }
}