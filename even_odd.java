import java.util.*;
public class even_odd
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.err.println("Enter the elements of the array:");
        for(int i=0; i<n; i++)        
    {
            arr[i] = sc.nextInt();
        }
        int even = 0;
        int odd = 0;
        for(int i=0; i<n; i++)
        {
            if(arr[i]%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }
        System.out.println("The number of even elements in the array are:"+even);
        System.out.println("The number of odd elements in the array are:"+odd);
    }
}