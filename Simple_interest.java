import java.util.Scanner;
public class Simple_interest
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the principal amount:");
        int p = sc.nextInt();
        System.out.println("enter the rate of interest:");
        int r = sc.nextInt();
        System.out.println("enter the time in years:");
        int t = sc.nextInt();
        int si = (p * r * t) / 100;
        System.out.println("Simple Interest: " + si);
    }
}