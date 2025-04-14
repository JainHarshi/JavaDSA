package Coaching.April14ControlFlowStatement;

import java.util.Scanner;

public class MinimumOfThreeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a<b && a<c){
            System.out.println("Smallest No is " + a);
        }
        if(b<a && b<c){
            System.out.println("Smallest No is " + b);
        }
        if(c<b&& c<a){
            System.out.println("Smallest No is " + c);
        }
        System.out.println("All of them are Equal ");
    }
}
