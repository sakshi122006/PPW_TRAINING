class Solution {
    public boolean validDigit(int n, int x) {
        int temp = n;
        boolean found = false;

        while (temp > 0) {
            if (temp % 10 == x) {
                found = true;
            }
            temp /= 10;
        }

        int firstDigit = n;
        while (firstDigit >= 10) {
            firstDigit /= 10;
        }

        return found && firstDigit != x;
    }
}
public class leetcode_3908 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 12345;
        int x = 3;
        boolean result = solution.validDigit(n, x);
        System.out.println(result); // Output: true
    }
}