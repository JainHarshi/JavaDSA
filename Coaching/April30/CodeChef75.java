package Coaching.April30;

import java.util.Scanner;

public class CodeChef75 {
    public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    while(n-- > 0){
	      int n1 = sc.nextInt();
	      int n2 = sc.nextInt();
	      
	     if(n1*100>= n2*10) System.out.println("CLOTH");
	     else System.out.println("Disposable");
	    }   
}}
// Q- https://www.codechef.com/practice/course/basic-programming-concepts/DIFF500/problems/CMASKS
