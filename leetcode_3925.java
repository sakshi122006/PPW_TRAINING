class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length*2;
        int ans[] = new int[n];
        for(int i=0; i<nums.length; i++)
        {
            ans[i]= nums[i];
        }
        int j = nums.length;
        for(int i=nums.length-1; i>=0; i--)
        {
            ans[j]= nums[i];
            j++;
        }
        return ans;
    }
}
