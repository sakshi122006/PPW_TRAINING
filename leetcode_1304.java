class Solution {
    public int[] sumZero(int n) {
        int arr[] =new int[n];
        int index=0;
        if(n % 2 == 1)
        {
            arr[index] = 0;
            index ++;
        }
        for(int i=1; index<n; i++)
        {
            arr[index] = -i;
            index ++;

            arr[index] = i;
            index ++;
        }
        return arr;
    }
}
