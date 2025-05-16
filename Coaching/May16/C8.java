package Coaching.May16;

import java.util.Scanner;

public class C8 {
    	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    while(n-- >0){
	        int n1 = sc.nextInt();
	       // int n2 = sc.nextInt();
	       // int n3 = sc.nextInt();
	        if(n1<= 100)System.out.println(n1);
	        else if(n1>100 && n1<= 1000)System.out.println(n1-25);
	        else if(n1>1000 && n1<= 5000)System.out.println(n1-100);
	        else System.out.println(n1-500);
	    }}
}
