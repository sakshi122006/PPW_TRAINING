import java.util.Scanner;

public class leetcode_137 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1. Dynamically read the array size
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        
        int[] nums = new int[n];
        System.out.println("Enter the " + n + " numbers:");
        for (int i = 0; i < n; i++) { 
            nums[i] = sc.nextInt();
        }
        
        // 2. Call the solution
        Solution solution = new Solution();
        int single = solution.singleNumber(nums);
        System.out.println("The single number is: " + single);
        
        sc.close(); // Good practice to close the scanner
    }
}

class Solution {
    public int singleNumber(int[] nums) {
        int ones = 0;
        int twos = 0;
        
        for (int num : nums) {
            // Update 'ones' only if the bit is not already in 'twos'
            ones = (ones ^ num) & ~twos;
            
            // Update 'twos' only if the bit is not already in the new 'ones'
            twos = (twos ^ num) & ~ones;
        }
        
        return ones;
    }
}