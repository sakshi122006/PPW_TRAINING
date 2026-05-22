/*Search an Element in Array
Class: ArraySearch
Functions:
void inputArray(int arr[])
boolean searchElement(int key)
Logic: Traverse array, check if key matches any element.*/
import java.util.Scanner;
public class ArraySearch
{
    public static void main(String[] args) 
    {
        ArraySearch obj = new ArraySearch();
        obj.inputArray();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to search: ");
        int key = sc.nextInt(); // Example key to search
        boolean found = obj.searchElement(key);
        if (found) {
            System.out.println("Element " + key + " found in the array.");
        } else {
            System.out.println("Element " + key + " not found in the array.");
        }
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
    boolean searchElement(int key)
    {
        for (int num : arr) 
        {
            if (num == key) 
            {
                return true; // Element found
            }
        }
        return false; // Element not found
    }
}