/* Calculate Sum of Array Elements
Class: ArraySum
Functions:
void inputArray(int arr[])
int calculateSum()
Logic: Traverse array and add all values to sum.*/
import java.util.Scanner;
public class ArraySum {
    int[] arr;
    int sum;
     
    public static void main(String[] args) 
    {
        ArraySum obj = new ArraySum();
        obj.inputArray();
        int result = obj.calculateSum();
        System.out.println("Sum of array elements: " + result);
    }
    void inputArray()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }
    }
    int calculateSum()
    {
        sum = 0;
        for (int i = 0; i < arr.length; i++) 
        {
            sum += arr[i];
        }
        return sum;
    }

    
}