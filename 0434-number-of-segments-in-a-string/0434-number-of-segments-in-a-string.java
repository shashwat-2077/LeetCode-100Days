class Solution {
    public int countSegments(String s) {
        int segmentCount = 0;
        
        for(int i = 0; i<s.length(); ++i)
            if(s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' '))
                ++segmentCount;
        
        return segmentCount;
        
    }
}