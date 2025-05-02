package Coaching.May1;

public class ReverseWholeNo {
    public static void main(String[] args) {
        int sum =0;
        int n =121;
        int r =1;
        while(n>0){
            n = n%10;
           sum = sum*10 + n;
           n = n/10;
        }
        System.out.println("No" + sum);
    }
}
