package Coaching.June23;

public class SpyNoRecurssion {
    public static void main(String[] args) {
        int n = 123;
        SpyNo(n, 0, 0);
        if()
        
    }
    public static boolean SpyNo(int n , int mul , int sum){
        if(n == 0){
            return mul == sum;
        }
        sum = sumOfDigit(n , 0); 
        mul = mulOfDigit(n , 1);
        return SpyNo(n/10, mul , sum );
    }
    public static int sumOfDigit(int n , int sum){
        if(n == 0){
            return sum;
        }
        sum = sum + n%10;
        return sumOfDigit(n/10, sum);
    }
    public static int mulOfDigit(int n , int mul){
        if(n == 0){
            return mul;
        }
        mul = mul * n%10;
        return mulOfDigit(n/10, mul);
    }

}
