import java.util.Scanner;
public class array_2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        System.err.println("Enter the elements of the array:");
        for(int i=0; i<n; i++)// for sum of elements of the array
        {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        System.out.println("The sum of elements of the array are:"+sum);
        int avg = sum/n;// average of elements of the array
        System.out.println("The average of the elements of the array are:"+avg);
    }
}
