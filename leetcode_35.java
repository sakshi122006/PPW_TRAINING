class solution5
{
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid; // Target found, return its index
            } else if (nums[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        // Target not found, return the insertion point
        return left;
    }
}
public class leetcode_35
{
    public static void main(String[] args) {
        solution5 sol = new solution5();
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        int result = sol.searchInsert(nums, target);
        System.out.println("Target " + target + " is at index: " + result);

        target = 2;
        result = sol.searchInsert(nums, target);
        System.out.println("Target " + target + " should be inserted at index: " + result);

        target = 7;
        result = sol.searchInsert(nums, target);
        System.out.println("Target " + target + " should be inserted at index: " + result);

        target = 0;
        result = sol.searchInsert(nums, target);
        System.out.println("Target " + target + " should be inserted at index: " + result);
    }
}