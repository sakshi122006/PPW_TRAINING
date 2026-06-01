import java.util.Scanner;

public class leetcode_20 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String s = sc.nextLine();
        Solution_1 obj = new Solution_1();
        boolean result = obj.isValid(s);
        System.out.println(result);
        sc.close(); 
    }
}

class Solution_1 {
    public boolean isValid(String s) {
        char letter[] = new char[s.length()];
        int top = -1;
        
        for (int i = 0; i < s.length(); i++) {
            char current_char = s.charAt(i);
            
            if (current_char == '(' || current_char == '{' || current_char == '[') {
                top++;
                letter[top] = current_char;
            } else {
                if (top == -1) return false;
                
                char top_char = letter[top];
                if ((current_char == ')' && top_char == '(') ||
                    (current_char == '}' && top_char == '{') ||
                    (current_char == ']' && top_char == '[')) {
                    top--;
                } else {
                    return false;
                }
            }
        }
        return top == -1;
    }
}