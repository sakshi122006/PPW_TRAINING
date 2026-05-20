import java.util.Scanner;
public class palindrome_array
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean flag = true;
        
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        // copy array
        int[] copy_arr = new int[n];
        for(int i=0; i<n; i++)
        {
            copy_arr[i] = arr[i];
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

        for(int i=0; i<arr.length; i++)
        {
           if(arr[i] != copy_arr[i])
                {
                    flag = false;
                    break;
                }
        }
        if(flag)
        {
            System.out.println("The array is a palindrome.");
        }
        else
        {
            System.out.println("The array is not a palindrome.");
        }
    }
}