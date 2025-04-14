package Coaching.April07;
import java.util.*;

public class numberDivisibleByGivenNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n%5 == 0 && n%7 == 0);
    }
}
