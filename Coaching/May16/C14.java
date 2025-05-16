package Coaching.May16;

import java.util.Scanner;

public class C14 {
    	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    while(n-- >0){
	        int n1 = sc.nextInt();
	        if(n1>50)System.out.println("Right");
	        else System.out.println("Left");}
	}
}
