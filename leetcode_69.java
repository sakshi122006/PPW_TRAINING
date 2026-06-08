class Solution {
    public int mySqrt(int x) {
        // Base cases for 0 and 1
        if (x == 0 || x == 1) {
            return x;
        }
        
        int left = 1;
        int right = x;
        int result = 0;
        
        while (left <= right) {
            // Find the middle point (this formula prevents integer overflow)
            int mid = left + (right - left) / 2;
            
            // Instead of mid * mid <= x, we use division to prevent overflow
            if (mid <= x / mid) {
                // mid is a potential answer. Save it, and try to find a larger one.
                result = mid;
                left = mid + 1;
            } else {
                // mid squared is too big. The answer must be smaller.
                right = mid - 1;
            }
        }
        
        return result;
    }
}
public class leetcode_69 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int x = 8;
        int result = solution.mySqrt(x);
        System.out.println(result); // Output: 2
    }
}