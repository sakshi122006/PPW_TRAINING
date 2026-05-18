import java.util.Scanner;
public class Basic_salary
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the basic salary:");
        double basicSalary = sc.nextDouble();
        
        double hra = 0.0;
        double da = 0.0;
        
        if (basicSalary < 10000) {
            hra = 0.2 * basicSalary; 
            da = 0.8 * basicSalary;  
        } else if (basicSalary < 20000) {
            hra = 0.25 * basicSalary; 
            da = 0.9 * basicSalary;   
        } else {
            hra = 0.3 * basicSalary; 
            da = 0.95 * basicSalary;         
        }
        
        double grossSalary = basicSalary + hra + da;
        
        System.out.println("Gross Salary: " + grossSalary);
    }
}