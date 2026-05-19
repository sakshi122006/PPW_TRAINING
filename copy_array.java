import java.util.Scanner;
public class copy_array
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int[] copy_arr = new int[n];
        for(int i=0; i<n; i++)
        {
            copy_arr[i] = arr[i];
        }
        System.out.println("The elements of the copied array are:");
        for(int i=0; i<n; i++)
        {
            System.out.print(copy_arr[i] + " ");
        }
    }
}