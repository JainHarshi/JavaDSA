package Coaching.April30;

import java.util.Scanner;

public class CodeChef104 {
    	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
	   // int n = sc.nextInt();
	   // while(n-- >0){
	        int n1 = sc.nextInt();
	        float n2 = sc.nextFloat();
	       // int n3 = sc.nextInt();
	       // System.out.println(n1-n2);
	       if(n1%5==0 && n1+0.5 <= n2 ) System.out.println(n2-(n1+0.5));
	        else System.out.println(n2);
	       //else System.out.println(n1);
// 	}
}}
