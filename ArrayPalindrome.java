/* Check Array is Palindrome or Not
Class: ArrayPalindrome
Functions:
void inputArray(int arr[])
boolean isPalindrome()
Logic: Compare arr[i] with arr[n-i-1].*/
import java.util.Scanner;
public class ArrayPalindrome
{
    int arr[];
    public static void main(String[] args) {
        ArrayPalindrome obj = new ArrayPalindrome();
        obj.inputArray();
        if (obj.isPalindrome()) {
            System.out.println("The array is a palindrome.");
        } else {
            System.out.println("The array is not a palindrome.");
        }
    }
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
    public boolean isPalindrome() 
    {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != arr[n - i - 1]) {
                return false;
            }
        }
        return true;
    }
}