public class leetcode_28
{
    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        solution4 solution = new solution4();
        int result = solution.strStr(haystack, needle);
        System.out.println(result); // Output: 2
    }
}
class solution4
{
    public int strStr(String haystack, String needle) 
    {
        int i, j;
        for(i = 0; i <= haystack.length() - needle.length(); i++)
        {
            for(j = 0; j < needle.length(); j++)
            {
                if(haystack.charAt(i + j) != needle.charAt(j))
                {
                    break;
                }
            }
            if(j == needle.length())
            {
                return i;
            }
        }
        return -1;
    }
}