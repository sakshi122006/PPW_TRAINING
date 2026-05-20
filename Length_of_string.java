
import java.util.Scanner;

public class Length_of_string
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int length = str.length();
        System.out.println("Length of the string: " + length);
    }
}