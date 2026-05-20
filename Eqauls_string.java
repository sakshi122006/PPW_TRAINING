import java.util.Scanner;
public class Eqauls_string
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings:");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int count = 0;
        for(int i=0; i<str1.length(); i++)
        {
            if(str1.charAt(i) != str2.charAt(i))
            {
                count++;
                break;
            }
        }
        if(count == 0)
        {
            System.out.println("The two strings are equal.");
        }
        else
        {
            System.out.println("The two strings are not equal.");
        }

        // Using inbuilt function
        if(str1.equals(str2))
        {
            System.out.println("The two strings are equal.");
        }
        else
        {
            System.out.println("The two strings are not equal.");
        }
    }
    
}