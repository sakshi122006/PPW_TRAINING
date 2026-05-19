import java.util.Scanner;
public class No_of_notes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int[] notes = {1000, 500, 100, 50, 20, 10, 5, 2, 1};
        int[] count = new int[notes.length];
        for (int i = 0; i < notes.length; i++) 
        {
            count[i] = amount / notes[i];
            amount = amount % notes[i];
        }
        for (int i = 0; i < notes.length; i++) 
            {
            if (count[i] > 0) {
                System.out.println(notes[i] + " : " + count[i]);
            }
        }
    }
    
}
