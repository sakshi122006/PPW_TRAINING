/*Calculate Average of Array Elements
Class: ArrayAverage
Functions:
void inputArray(int arr[])
double findAverage()
Logic: Use sum ÷ total elements.*/
import java.util.Scanner;
public class ArrayAverage 
{
    public static void main(String[] args) 
    {
        ArrayAverage obj = new ArrayAverage();
        obj.inputArray();
        double result = obj.findAverage();
        System.out.println("Average of array elements: " + result);
    }
    int[] arr;
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
    double findAverage()
    {
        int sum = 0;
        for (int num : arr) 
        {
            sum += num;
        }
        return (double) sum / arr.length;
    }
}