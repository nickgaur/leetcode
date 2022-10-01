class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int n=shifts.length;
        long psum[]=new long[n];
        psum[n-1]=shifts[n-1];
        for(int i=n-2;i>=0;i--)
        {
            psum[i]=psum[i+1]+shifts[i];
        }
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<psum.length;i++)
        {
            char ch=s.charAt(i);
            long ascii=(long)ch - 97;
            long newAscii=97+ (ascii+psum[i])%26;
            sb.append((char)newAscii);
        }
        return sb.toString();
    }
}