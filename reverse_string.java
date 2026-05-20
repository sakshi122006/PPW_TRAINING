import java.util.Scanner;
public class reverse_string 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first String :");
        String s = scan.nextLine();
        String reverse = "";
        for(int i=s.length()-1;i>=0;i--)
        {
            reverse = reverse + s.charAt(i);
        }
        System.out.println("Reverse String : "+reverse);
    }
}