class Solution {
    public int[] minCosts(int[] cost) {
        int min = Integer.MAX_VALUE;
        int[] ans = new int[cost.length];
        for(int i=0; i<cost.length; i++)
        {
            if(cost[i]<min)
            {
                min = Math.min(min,cost[i]);
            }
            ans[i] = min;
        }
        return ans;
    }
}
