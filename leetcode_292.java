public class leetcode_292 {
    public static void main(String[] args) {
        Solution9 solution = new Solution9();
        int n = 3;
        boolean result = solution.canWinNim(n);
        System.out.println("Can win Nim with " + n + " stones: " + result);
    }
}
class Solution9 {
    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }
}