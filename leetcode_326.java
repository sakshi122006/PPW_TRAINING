public class leetcode_326 {
    public static void main(String[] args) {
        Solution10 solution = new Solution10();
        int n = 16;
        boolean result = solution.isPowerOfThree(n);
        System.out.println(n + " is a power of three: " + result);
    }
}
class Solution10 {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }
}
