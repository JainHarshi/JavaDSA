package Coaching.April14ControlFlowStatement;

import java.util.Scanner;

public class DayNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a==1) System.out.println("Monday");
        if(a==2) System.out.println("Tuesday");
        if(a==3) System.out.println("Wednesday");
        if(a==4) System.out.println("Thrusday");
        if(a==5) System.out.println("Friday");
        if(a==6) System.out.println("Satday");
        if(a==7) System.out.println("Sunday");
    }
}
