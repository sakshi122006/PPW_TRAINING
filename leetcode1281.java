public  class leetcode1281 {
    public static void main(String[] args) {
        Solution7 solution = new Solution7();
        int num = 14;
        int result = solution.subtractProductAndSum(num);
        System.out.println("Subtract product and sum of digits of " + num + ": " + result);
    }
}
class Solution7 {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            product *= digit;
            sum += digit;
            n /= 10;
        }

        return product - sum;
    }
}