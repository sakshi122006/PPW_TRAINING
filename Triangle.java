import java.util.Scanner;
public class Triangle
{
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the lengths of the three sides of the triangle:");
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();   
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("The sides form a valid triangle.");
        } else {
            System.out.println("The sides do not form a valid triangle.");
        }
    }
}
