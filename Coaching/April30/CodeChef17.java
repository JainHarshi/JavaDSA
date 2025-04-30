package Coaching.April30;

import java.util.Scanner;

public class CodeChef17 {
    public static void main(String[] args) {
        
    
    	Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    while(n-- > 0){
	      int n1 = sc.nextInt();
	      int n2 = sc.nextInt();
	      int m = ((n1-n2));
	      if(m == Math.abs((n1-n2)))System.out.println((n1-n2));
	      else System.out.println(0);
	    }
}}

// Q- https://www.codechef.com/practice/course/basic-programming-concepts/DIFF500/problems/IPLTRSH

