package Coaching.June13;

public class SpyNo {
    public static void main(String[] args) {
        int n = 123;
        int temp =n;
        int sum =0;
        int mul =1;
        while(n>0){
            sum += n%10;
            mul *= n%10;
            n /= 10;
        }
        System.out.println(mul == sum ? "SPY NO" : "NOT A SPY NO");

    }
}
