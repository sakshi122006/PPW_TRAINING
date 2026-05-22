/*Reverse the Array
Class: ArrayReverse
Functions:
void inputArray(int arr[])
void reverseArray()
*/
import java.util.Scanner;
public class ArrayReverse
{
    int arr[];
    public void inputArray()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
    }

    public void reverseArray() {
        int start = 0, end = arr.length - 1;
        while (start < end) 
            {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public void displayArray() {
        System.out.println("Reversed array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}