package Coaching.June23;

import Coaching.May1.SumOfDigit;

public class HarshadNo {
    public static void main(String[] args) {
        int n = 18;
        int div = 0;
        System.out.println(HarshadNo(n, div));
    }
    public static boolean HarshadNo(int n ,int div){
        
        int sum = sumOfDigit(n , 0);

         return n%div == 0;

    }
    public static int sumOfDigit(int n, int sum){
        if(n == 0) return sum;
        sum += n%10;
        return sumOfDigit(n/10 , sum);
    }
}
