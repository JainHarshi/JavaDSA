package Coaching.April30;

import java.util.Scanner;

public class CodeChef110 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    while(n-- >0){
	        int n1 = sc.nextInt();
	        int n2 = sc.nextInt();
	       // int n3 = sc.nextInt();
	        if(n1*3>n2*2 )System.out.println(n2*2);
	        else System.out.println(n1*3);
        }
    }
}
