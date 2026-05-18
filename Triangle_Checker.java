import java.util.Scanner;
public class Triangle_Checker
{
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the angles of the triangle:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a + b + c == 180) {
            if (a == b && b == c && a == c) {
                System.out.println("The triangle is an equilateral triangle.");
            } else if (a == b || b == c || a == c) {
                System.out.println("The triangle is an isosceles triangle.");
            } else {
                System.out.println("The triangle is a scalene triangle.");
            }
        } else {
            System.out.println("The angles do not form a valid triangle.");
            
        }
       
    }
}