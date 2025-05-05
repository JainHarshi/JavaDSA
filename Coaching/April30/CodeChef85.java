package Coaching.April30;

import java.util.Scanner;

public class CodeChef85 {
    	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    while(n-- >0){
	        int n1 = sc.nextInt();
	       int  f1= n1%10;
	       int l1 = 0;
	        while(n1>0){
	            l1= n1%10;
	            n1 /= 10;
	        }
	       // int n2 = sc.nextInt();
	        System.out.println(l1 + f1);
	       // else System.out.println((int)n1*0.1);
	        
	        
	    }
}}

// Q- https://www.codechef.com/practice/course/basic-programming-concepts/DIFF500/problems/FLOW004
