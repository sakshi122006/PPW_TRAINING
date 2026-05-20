
import java.util.Scanner;

public class copy_string
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = " "; 
        for(int i=0; i<str1.length(); i++)// Without using inbuilt function
        {
            str2 = str2 + str1.charAt(i);
        }
        System.out.println("Original string: " + str1);
        System.out.println("Copied string: " + str2);
        
        // Concatenating two strings
        String str3 = sc.nextLine();
        String str4 = str1 + str3; // Using inbuilt function
        System.out.println("Concatenated string: " + str4);
    }
}