import java.util.Scanner;
public class duplicate_no
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean found = false;
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i] == arr[j])
                {
                    System.out.println("Duplicate element found: " + arr[i]);
                    found = true;
                    break;
                }
            }
            if(found)
            {
                break;
            }
        }
            if(!found)
            {
                System.out.println("No duplicate element found in the array.");
            }
    }       
}