package Coaching.May16;

import java.util.Scanner;

public class C1 {
   	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    while(n-- >0){
	        int n1 = sc.nextInt();
	        int n2 = sc.nextInt();
	        int n3 = sc.nextInt();
	        if(Math.ceil((n1+n2)/2.0) > Math.ceil(n3))System.out.println("YES");
	        else System.out.println("NO");	}
} 
}
