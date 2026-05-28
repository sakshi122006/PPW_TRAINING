import java.util.Scanner;
class Solution3 {
    public int duplicateNumbersXOR(int[] nums) {
        // Since constraints say 1 <= nums[i] <= 50, 
        // an array of size 51 can track frequencies for indices 0 to 50.
        int[] counts = new int[51];
        
        // Step 1: Count how many times each number appears
        for (int num : nums) {
            counts[num]++;
        }
        
        int xorSum = 0;
        
        // Step 2: Look for numbers that appeared exactly twice
        for (int i = 1; i <= 50; i++) {
            if (counts[i] == 2) {
                xorSum ^= i; // XOR the number into our result
            }
        }
        
        return xorSum;
    }
}
public class leetcode_3158
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Solution3 solution = new Solution3();
        int duplicateXOR = solution.duplicateNumbersXOR(nums);
        System.out.println("The XOR of all numbers that appear exactly twice is: " + duplicateXOR);
    }
}