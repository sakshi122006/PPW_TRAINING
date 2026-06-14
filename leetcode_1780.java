public class leetcode_1780 {
    public static void main(String[] args) {
        Solution11 solution = new Solution11();
        int n = 5;
        boolean result = solution.checkPowersOfThree(n);
        System.out.println("Can " + n + " be expressed as a sum of distinct powers of three: " + result);
    }
}
class Solution11 {
    public boolean checkPowersOfThree(int n) {
        while (n > 0) {
            if (n % 3 == 2) {
                return false;
            }
            n /= 3;
        }
        return true;
    }
}