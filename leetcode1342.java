public class leetcode1342 
{
    public static void main(String[] args) 
    {
        Solution8 solution = new Solution8();
        int num = 14;
        int result = solution.numberOfSteps(num);
        System.out.println("Number of steps to reduce " + num + " to zero: " + result);
    }
}
class Solution8{
    public int numberOfSteps(int num) {
        int steps = 0;

        while (num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }
            steps++;
        }

        return steps;
    }
}