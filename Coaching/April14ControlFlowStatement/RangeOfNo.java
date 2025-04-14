package Coaching.April14ControlFlowStatement;

import java.util.Scanner;

public class RangeOfNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>= 30 && n<= 50){
            System.out.println("Yes");
        }
        if(n<30 || n>50){
            System.out.println("No");
        }
    }
}
