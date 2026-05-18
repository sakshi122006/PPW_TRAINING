import java.util.Scanner;
public class Swap2
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        
        // Swapping using a without temporary variable
        a=a+b; // a now holds the sum of a and b
        b=a-b; // b now holds the original value of a
        a=a-b; // a now holds the original value of b
        
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}