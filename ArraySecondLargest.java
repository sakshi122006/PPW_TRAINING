/*Find Second Largest Element
Class: ArraySecondLargest
Functions:
void inputArray(int arr[])
int findSecondLargest()
Logic: First find max, then find element just smaller than max.*/
import java.util.Scanner;
public class ArraySecondLargest
{
    private int[] arr;

    public static void main(String[] args) {
        ArraySecondLargest obj = new ArraySecondLargest();
        obj.inputArray();
        int secondLargest = obj.findSecondLargest();
        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("Second largest element: " + secondLargest);
        } else {
            System.out.println("No second largest element found.");
        }
    }

    public void inputArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
    }

    public int findSecondLargest() {
        if (arr.length < 2) {
            return Integer.MIN_VALUE; // Not enough elements for second largest
        }
        
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }
        
        return secondMax;
    }
}