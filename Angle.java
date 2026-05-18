import java.util.Scanner;
public class Angle
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First angle:");
        int fang = sc.nextInt();
        System.out.println("Enter the Second angle:");
        int sang = sc.nextInt();
        if(fang + sang < 180 && fang > 0 && sang > 0)
        {
            System.out.println("The Third angle is:" + (180 - (fang + sang)));
        }
        else
        {
            System.out.println("Invalid angles");
        }
        
    }
}