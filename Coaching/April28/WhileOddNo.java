package Coaching.April28;

import java.util.Scanner;

public class WhileOddNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i =1;
        while(i <= n ){
            if(i%2 != 0) System.out.println("Odd no - " +i);
        }
       
    }
}
