import java.util.Scanner;

class ArrayMax
{
    int n;
    int arr[];

    void inputArray()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
    }
    int findMax()
    {
        int max = arr[0];
        for(int i = 1; i < n; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        return max;
    }
    int findMin()
    {
        int min = arr[0];
        for(int i = 1; i < n; i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }

        return min;
    }

    public static void main(String args[])
    {
        ArrayMax obj = new ArrayMax();
        obj.inputArray();
        System.out.println("Maximum element = " + obj.findMax());
        System.out.println("Minimum element = " + obj.findMin());
    }
}