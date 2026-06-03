public class Leetcode58 {
    public static void main(String[] args) {
        // Corrected class name here
        Solution solution = new Solution(); 
        String s = "Hello World";
        int result = solution.lengthOfLastWord(s);
        System.out.println("Length of the last word: " + result);
    }
}

// Corrected class name here
class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;
        
        // Step 1: Skip any trailing spaces at the end of the string
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        
        // Step 2: Count the characters of the last word
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }
        
        return length;
    }
}