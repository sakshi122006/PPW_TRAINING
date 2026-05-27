import java.util.Scanner;
class Solution
{
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR operation
        }
        return result;
    }
}
public class leetcode_136
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[3]; // Example array size, can be modified as needed
        System.out.println("Enter 5 numbers (with one single number):");
        for (int i = 0; i < nums.length; i++) { 
            nums[i] = sc.nextInt();
        }
        Solution solution = new Solution();
        int single = solution.singleNumber(nums);
        System.out.println("The single number is: " + single);
    }
}

