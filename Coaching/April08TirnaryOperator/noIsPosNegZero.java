package Coaching.April08TirnaryOperator;

import java.util.Scanner;

public class noIsPosNegZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String s = a >= 0 ? a>0 ? "Positive" : "Zero" : "Negative";
        System.out.println(s);  
    }
}
