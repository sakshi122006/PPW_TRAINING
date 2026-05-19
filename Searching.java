import java.util.Scanner;
public class Searching
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
            System.out.println("Enter the element to be searched:");
            int key = sc.nextInt();
            boolean found = false;
            for(int i=0; i<n; i++)
            {
                if(arr[i] == key)
                {
                    found = true;
                    break;
                }
            }
            if(found)
            {
                System.out.println("Element found in the array.");
            }
            else
            {
                System.out.println("Element not found in the array.");
            }
        }
}