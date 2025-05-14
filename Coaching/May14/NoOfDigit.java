package Coaching.May14;

public class NoOfDigit {
    public static void main(String[] args) {
        int count =0;
        int n = 123;
        while(n>0){
            count++;
            n =n/10;
        }
        System.out.println(count);
    }
}
