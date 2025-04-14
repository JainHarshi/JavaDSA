package Coaching.April08TirnaryOperator;

import java.util.Scanner;

public class twoNoDiv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String s = a%5 ==0  ? a%7 == 0 ? "Div by both" : "Div by 5" : a%7 == 0 ? "Div by 7" : "Nothing Div";
        System.out.println(s);
    }
    
}
