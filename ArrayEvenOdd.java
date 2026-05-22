/*Count Even and Odd Numbers
Class: ArrayEvenOdd
Functions:
void inputArray(int arr[])
int countEven()
int countOdd()
Logic: Use % 2 == 0 check.*/
import java.util.Scanner;
public class ArrayEvenOdd
{
    int arr[];
    public void inputArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
    }

    public int countEven() {
        int evenCount = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }
        return evenCount;
    }

    public int countOdd() {
        int oddCount = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                oddCount++;
            }
        }
        return oddCount;
    }

    public static void main(String[] args) 
    {
        ArrayEvenOdd obj = new ArrayEvenOdd();
        obj.inputArray();
        int evenCount = obj.countEven();
        int oddCount = obj.countOdd();
        System.out.println("Number of even elements: " + evenCount);
        System.out.println("Number of odd elements: " + oddCount);
    }
}