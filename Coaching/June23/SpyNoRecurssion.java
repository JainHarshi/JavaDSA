package Coaching.June23;

public class SpyNoRecurssion {
    public static void main(String[] args) {
        int n = 123;
        
        if(SpyNo(n, 0, 0)){
            System.out.println(n +" Given No is SPY No");
        }
        else{
            System.out.println(n + " Not a SPY NO");
        }
        
    }
    public static boolean SpyNo(int n , int mul , int sum){
       
        sum = sumOfDigit(n , 0); 
        mul = mulOfDigit(n , 1);
        if(sum == mul) return true;
        return false;
        
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
