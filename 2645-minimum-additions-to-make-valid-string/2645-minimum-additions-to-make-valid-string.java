class Solution {
    public int addMinimum(String word) {
        final char[] validLetters = new char[] {'a', 'b', 'c'};
        int ans = 0;
        int i = 0;
        
        while(i < word.length())
            for(final char c : validLetters){
                if(i < word.length() && word.charAt(i) == c)
                    ++i;
                else
                    ++ans;
            }
        return ans;
    }
}