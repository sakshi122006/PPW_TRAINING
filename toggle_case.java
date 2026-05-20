import java.util.Scanner;
public class toggle_case
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i =0;i< str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z')
            {
                System.out.print((char)(ch - 32));
            }
            else if(ch >= 'A' && ch <= 'Z')
            {
                System.out.print((char)(ch + 32));
            }
            else
            {
                System.out.print(ch);
            }
        }
    }
}