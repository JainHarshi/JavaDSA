package Coaching.April14ControlFlowStatement;
import java.util.Scanner;

public class SmallestOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>b){
            System.out.println("Smallest No is " + b);
        }
        else{
        System.out.println("Smallest No is " + a);}
    }
}
