class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++)
        {
            int digit = nums[i];
            int sum = 0;
            while(digit>0)
            {
                int last = digit % 10;
                sum = sum + last;
                digit = digit / 10;
            }
            if(min>sum)
            {
                min = sum;
            }
        }
        return min;
    }
}
