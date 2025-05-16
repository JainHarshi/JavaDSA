package Coaching.May16;

import java.util.Scanner;

public class C12 {
    	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    while(n-- >0){
	        int n1 = sc.nextInt();
	        int n2 = sc.nextInt();
	       // int n3 = sc.nextInt();
	        if(n1<n2)System.out.println("BIKE");
	        else if(n1>n2)System.out.println("CAR");
	        else System.out.println("SAME");}}
}
