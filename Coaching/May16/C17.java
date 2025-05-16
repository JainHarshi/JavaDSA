package Coaching.May16;

import java.util.Scanner;

public class C17 {
    	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    
	    while(n-- >0){
	        int n1 = sc.nextInt();
	       // int n2 = sc.nextInt();
	       System.out.println(Math.round((Math.ceil(n1/4.0))));
	}}
}
