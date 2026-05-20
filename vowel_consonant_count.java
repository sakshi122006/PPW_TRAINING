import java.util.Scanner;
public class vowel_consonant_count 
{
    public static void main(String[] args)
 {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first String :");
        String s1 = scan.next();
        int vowelCount=0;
        int consonantCount = 0;
        for(int i=0; i<s1.length();i++)
        {
            char ch = s1.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            {
                vowelCount++;
            }
            else
            {
                consonantCount++;
            }
        }
        System.out.println("Vowel Count : "+vowelCount);
        System.out.println("Consonant Count : "+consonantCount);
 }
        
}