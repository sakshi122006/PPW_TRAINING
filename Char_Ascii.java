import java.util.Scanner;
public class Char_Ascii
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character :");
        char ch = sc.next().charAt(0); 
        int asciiValue = (int) ch; 
        int a = asciiValue - 32; // Convert to uppercase if it's a lowercase letter
        System.out.println("The uppercase version of '" + ch + "' is: '" + (char) a );
    }
}