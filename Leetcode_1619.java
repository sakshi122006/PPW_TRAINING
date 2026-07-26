class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int sum = 0;
        int remove = arr.length / 20;

        for(int i=remove; i<arr.length-remove; i++)
        {
            sum = sum + arr[i];
        }
        int remaining = arr.length - 2 * remove;
        double ans = sum * 1.0 /remaining;
        return ans;
    }
}
