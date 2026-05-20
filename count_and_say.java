 


    import java.util.Scanner;
    
    public class count_and_say {
    
        public static void main(String[] args) 
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter first String :");
            String s1 = scan.next();
            int countDigit=0;
            int lower = 0;
            int upper = 0;
            int specialChar =0 ;
            for(int i=0; i<s1.length();i++)
            {
                char ch = s1.charAt(i);
                if(ch>=65 && ch<=90)
                {
                    upper++;
                }
                else if(ch>=97 && ch<=122)
                {
                    lower++;
                }
                else if(ch>='1' && ch<='9')
                {
                    countDigit++;
                }
                else
                {
                    specialChar++;
                }
            }
            System.out.println("Lower Characters : "+lower);
            System.out.println("Upper Characters : "+upper);
            System.out.println("Digit  : "+countDigit);
            System.out.println("Special Characters  : "+specialChar);
        }
    
    }