import java.util.Scanner;
public class Time
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter seconds:");
        int seconds = sc.nextInt();
        int hours = seconds / 3600; // Convert seconds to hours
        int remainingSeconds = seconds % 3600; // Get remaining seconds after converting to hours
        int minutes = remainingSeconds / 60; // Convert remaining seconds to minutes
        System.out.println("Time: " + hours + " hours, " + minutes + " minutes");
    }
}