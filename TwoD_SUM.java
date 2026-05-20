
import java.util.Scanner;
public class TwoD_SUM
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        int sum = 0;
        System.out.println("Enter the elements of the 2D array:");
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                arr[i][j] = sc.nextInt();
                sum = sum + arr[i][j];
            }
        }
        System.out.println("Sum of all elements in the 2D array: " + sum);
    }
}