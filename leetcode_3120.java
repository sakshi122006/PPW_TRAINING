class Solution {
    public int numberOfSpecialChars(String word) {
        int count = 0;
        for(char ch='a'; ch<='z'; ch++)
        {
            if(word.contains(""+ch) && word.contains(""+Character.toUpperCase(ch)))
            {
                count ++;
            }
        }
        return count;
    }
}
