import java.util.Scanner;
class Solution1 {
    public int[] singleNumber(int[] nums) {
        // Step 1: Get the XOR sum of the two unique numbers (A ^ B)
        int xorSum = 0;
        for (int num : nums) {
            xorSum ^= num;
        }    
        // Step 2: Find the lowest set bit (rightmost 1-bit) in the xorSum
        // This bit acts as our distinguishing mask between A and B
        int lowestSetBit = xorSum & -xorSum;    
        // Step 3: Divide numbers into two groups and XOR them separately
        int num1 = 0;
        int num2 = 0;    
        for (int num : nums) {
            if ((num & lowestSetBit) == 0) {
                // Group 1: Bit is 0
                num1 ^= num;
            } else {
                // Group 2: Bit is 1
                num2 ^= num;
            }
        }
        return new int[]{num1, num2};
    }
}
public class leetcode_260 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        Solution1 solution = new Solution1();
        int[] result = solution.singleNumber(nums);
        System.out.println("The two unique numbers are: " + result[0] + " and " + result[1]);
        scanner.close();
    }
}