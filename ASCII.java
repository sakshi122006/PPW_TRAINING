import java.util.Scanner;
public class ASCII
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character to find its ASCII value:");
        char ch = sc.next().charAt(0); // Read a single character from the user
        int asciiValue = (int) ch; // Casting the character to an integer gives its ASCII value
        System.out.println("The ASCII value of '" + ch + "' is: " + asciiValue);
    }
}