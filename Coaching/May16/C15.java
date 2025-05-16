package Coaching.May16;

import java.util.Scanner;

public class C15 {
    	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    while(n-- >0){
	        int n1 = sc.nextInt();
	        if(n1%4 == 0) System.out.println(" Good");
	        else System.out.println("Not Good");
	}
}}
