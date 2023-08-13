class Solution {
    public int minimumSum(int num) {
        char[] characterArray = String.valueOf(num).toCharArray();
        Arrays.sort(characterArray);
        return (((characterArray[0] - '0')*10 + (characterArray[2] - '0')) + ((characterArray[1] - '0')*10 + (characterArray[3] - '0')));
    }
}