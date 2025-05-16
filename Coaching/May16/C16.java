package Coaching.May16;

import java.util.Scanner;

public class C16 {
    	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    
	    while(n-- >0){
	        int n1 = sc.nextInt();
	        int n2 = sc.nextInt();
	        int count =0;
	        while(n1-- >0){
	            int n3 = sc.nextInt();
	        if(n3>= n2) count++;
	}
	        System.out.println(count);
	    }}
}
