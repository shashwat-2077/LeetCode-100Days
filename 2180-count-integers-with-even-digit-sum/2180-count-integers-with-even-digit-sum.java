class Solution {
    public int countEven(int num) {
        if(sumOfDigits(num) %2 == 0)
            return num/2;
        return (num-1)/2; 
    }
    
    private int sumOfDigits(int num){
        int sum = 0;
        while (num>0){
            sum += num%10;
            num /= 10;
        }
        return sum;
    }
}