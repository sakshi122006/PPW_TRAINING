import java.util.Scanner;
public class Reversed
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.err.println("Enter the elements of the array:");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int temp;
        int start = 0,end = arr.length - 1;// to get the last index of the array
        while(start < end)// reversing the array elements also by swapping the first and last elements and
        {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        /*int len = arr.length - 1;// to get the last index of the array
        for(int i=0; i>=len/2; i++)// reversing the array elements also by swapping the first and last elements and so on
        {
            temp = arr[i];
            arr[i] = arr[len];
            arr[len] = temp;
            len--;
        }*/
        
        System.out.println("The elements of the array in reverse order are:");
        for(int i=0; i<n; i++)
       {
           System.out.print(arr[i] + " ");
            }
    }
}