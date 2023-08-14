class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder inputString = new StringBuilder(s);
        
        for (int i=0; i < inputString.length(); i+=2*k){
            int left = i;
            int right = Math.min(i+k-1, inputString.length() - 1);
            
            while(left<right){
                inputString.setCharAt(left, s.charAt(right));
                inputString.setCharAt(right, s.charAt(left));
                
                ++left;
                --right;
            }
        }
        return inputString.toString();
    }
}