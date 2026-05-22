/*Copy Array Elements into Another Array
Class: ArrayCopy
Functions:
void inputArray(int arr[])
int[] copyArray()
Logic: Loop through source array and store elements into new array.*/
import java.util.Scanner;
public class ArrayCopy
{
    int arr[] = new int[100];
    int size;

    public void inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        size = sc.nextInt();
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public int[] copyArray() {
        int copyArr[] = new int[size];
        for (int i = 0; i < size; i++) {
            copyArr[i] = arr[i];
        }
        return copyArr;
    }

    public static void main(String[] args) {
        ArrayCopy obj = new ArrayCopy();
        obj.inputArray();
        int[] copiedArray = obj.copyArray();
        System.out.println("Copied Array:");
        for (int num : copiedArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}