package Practice.StriverA2Z.Step1.Lec5;

public class Factorial {
    public static void main(String[] args) {
       System.out.println(factorial(5)); 
    }
    public static int factorial(int N) {
        if(N == 0 || N== 1) return 1;
        return N * factorial(N-1);
        

    }


}