class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int n = nums.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            long sum = 0;

            for (int j = i; j < n; j++) {
                sum += nums[j];

                int firstDigit = getFirstDigit(sum);
                int lastDigit = (int)(sum % 10);

                if (firstDigit == x && lastDigit == x) {
                    ans++;
                }
            }
        }

        return ans;
    }

    private int getFirstDigit(long num) {
        while (num >= 10) {
            num /= 10;
        }
        return (int) num;
    }
}
