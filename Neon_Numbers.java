import java.util.Scanner;
public class Neon_Numbers
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(); // You can change this to any number you want to check
        int square = number * number; 
        int sumOfDigits = 0;

        while (square > 0) {
            sumOfDigits += square % 10; 
            square /= 10;
        }

        if (sumOfDigits == number) {
            System.out.println(number + " is a Neon Number.");
        } else {
            System.out.println(number + " is not a Neon Number.");
        }
    }
}