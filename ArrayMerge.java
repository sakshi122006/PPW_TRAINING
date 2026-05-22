/*Merge Two Arrays
Class: ArrayMerge
Functions:
void inputArray(int arr1[], int arr2[])
int[] mergeArrays()
Logic: Create new array of size arr1.length + arr2.length and copy both arrays into it.*/
import java.util.Scanner;
public class ArrayMerge
{
    int[] arr1, arr2;

    public void inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of first array: ");
        int size1 = sc.nextInt();
        arr1 = new int[size1];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int size2 = sc.nextInt();
        arr2 = new int[size2];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }
    }

    public int[] mergeArrays() {
        int[] mergedArray = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, mergedArray, 0, arr1.length);
        System.arraycopy(arr2, 0, mergedArray, arr1.length, arr2.length);
        return mergedArray;
    }

    public static void main(String[] args) {
        ArrayMerge obj = new ArrayMerge();
        obj.inputArray();
        int[] result = obj.mergeArrays();
        System.out.println("Merged Array:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
