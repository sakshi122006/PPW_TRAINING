/*
 * Write a Java program to count total number of words in a string.
	Example: "I love india" → 3
	Using split("\\s+")
	Without using library function
 */

    import java.util.Scanner;
    
    public class split1 {
    
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter first String :");
            String s1 = scan.nextLine();
            int space = 0;
            for(int i=0; i<s1.length();i++)
            {
                char ch = s1.charAt(i);
                if(ch==' ')
                {
                    space++;
                }
            }
            
            int count = space+1;
            System.out.println("Total Words count : "+count);
            
            String[] Tocount = s1.split("\\s+");
            System.out.println("Total Words Without using Split(): "+Tocount.length);
        }
    
    }