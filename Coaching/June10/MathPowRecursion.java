package Coaching.June10;

public class MathPowRecursion {
    public static void main(String[] args) {
        System.out.println(myPow(2, -2));
    }
    public static double myPow(double x, int n) {
        long N = n;
        if(N<0){
            N = -N;
            x = 1/x;
        }
       return powhalf(x,N);
    }
    public static double powhalf(double x , long N){
        if(N == 0) return 1.0;
        double half = powhalf(x, N/2);

        if(N%2 == 0) {
            return half *half;
            }
        else{
            return half*half*x;
        }
    }

}
