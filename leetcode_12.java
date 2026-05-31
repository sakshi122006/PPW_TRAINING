class Solution6{
    public int romanToInt(String s) {

        int sum = 0;

        for (int i = 0; i < s.length(); i++) {

            int curr = 0;

            switch (s.charAt(i)) {
                case 'I': curr = 1; break;
                case 'V': curr = 5; break;
                case 'X': curr = 10; break;
                case 'L': curr = 50; break;
                case 'C': curr = 100; break;
                case 'D': curr = 500; break;
                case 'M': curr = 1000; break;
            }

            if (i < s.length() - 1) {

                int next = 0;

                switch (s.charAt(i + 1)) {
                    case 'I': next = 1; break;
                    case 'V': next = 5; break;
                    case 'X': next = 10; break;
                    case 'L': next = 50; break;
                    case 'C': next = 100; break;
                    case 'D': next = 500; break;
                    case 'M': next = 1000; break;
                }

                if (curr < next)
                    sum -= curr;
                else
                    sum += curr;
            } else {
                sum += curr;
            }
        }

        return sum;
    }
}
public class leetcode_12
{
    public static void main(String[] args) {
        Solution6 s = new Solution6();
        System.out.println(s.romanToInt("MCMXCIV"));
    }
}