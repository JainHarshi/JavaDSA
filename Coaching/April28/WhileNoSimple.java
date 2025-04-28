package Coaching.April28;

import java.util.Scanner;

public class WhileNoSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i =1;
        while(i >n){
           System.out.println(i++); 
        }
    }
}
