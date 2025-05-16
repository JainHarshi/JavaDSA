package Coaching.May16;

import java.util.Scanner;

public class C18 {
    	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    while(n-- >0){
	        int n1 = sc.nextInt();
	        int n2 = sc.nextInt();
	        if((n1*0.1) == (n2*0.2)) System.out.println("Any");
	        else if(n1*0.1 > n2*0.2) System.out.println("First");
	        else System.out.println("Second");
	}}
}
