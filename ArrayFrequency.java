/*Count Frequency of Each Element
Class: ArrayFrequency
Functions:
void inputArray(int arr[])
void countFrequency()
Logic: For each element, count how many times it appears using nested loop.*/
import java.util.Scanner;
public class ArrayFrequency
{
    private int[] arr;

    public static void main(String[] args)
    {
        ArrayFrequency obj = new ArrayFrequency();
        obj.inputArray();
        obj.countFrequency();
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

    public void countFrequency() {
        boolean[] visited = new boolean[arr.length];
        System.out.println("Element | Frequency");
        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(arr[i] + " | " + count);
        }
    }
}
    