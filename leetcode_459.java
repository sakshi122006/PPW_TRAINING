public class leetcode_459
{
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                String substring = s.substring(0, i);
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < n / i; j++) {
                    sb.append(substring);
                }
                if (sb.toString().equals(s)) {
                    return true;
                }
            }
        }
        return false;
    }

     public static void main(String[] args) {
        String s = "abcabcabc";
        leetcode_459 solution = new leetcode_459();
        boolean result = solution.repeatedSubstringPattern(s);
        System.out.println(result); // Output: true
    }
}