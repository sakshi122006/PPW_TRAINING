
import java.util.Scanner;

public class Merge
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];
        int merge[] =new int[6];

        System.out.println("enter elements of first array:");
        for(int i=0; i<arr1.length; i++)
        {
            arr1[i] = sc.nextInt();
        }
        System.out.println("enter elements of second array:");
        for(int i=0; i<arr2.length; i++)
        {
            arr2[i] = sc.nextInt();
        }
        for(int i=0 ; i< arr1.length ; i++)
        {
           merge[i] = arr1[i];
        }
        for(int i=0 ; i<arr2.length ; i++)
        {
           merge[arr2.length+i] = arr2[i];
        }
        System.out.println("merged array is:");
        for(int i=0; i<merge.length; i++)
        {
            System.out.print(merge[i] + " ");
        }
    }
}