class Solution {
    public boolean validDigit(int n, int x) {
        String s = String.valueOf(n);
        while(n>0)
        {
            int last = n % 10;
            if((last == x) && (s.charAt(0) - '0'!=x))
            {
                return true;
            }
            n = n / 10;
        }
        return false;
    }
}
