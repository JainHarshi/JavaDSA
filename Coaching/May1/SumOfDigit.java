package Coaching.May1;

public class SumOfDigit {
    public static void main(String[] args) {
        int sum =0;
        int n = 12345;
        while(n>0){
            System.out.println(sum +=n%10);
            n= n/10;
        }
    } 
}
