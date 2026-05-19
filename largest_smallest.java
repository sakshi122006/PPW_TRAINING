import java.util.Scanner;
public class largest_smallest
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
        int largest = arr[0];
        int smallest = arr[0];
        for(int i=1; i<n; i++)
        {
            if(arr[i] > largest)
            {
                largest = arr[i];
            }
            if(arr[i] < smallest)
            {
                smallest = arr[i];
            }
        }
        System.out.println("The largest element of the array is:"+largest);
        System.out.println("The smallest element of the array is:"+smallest);
    }
}