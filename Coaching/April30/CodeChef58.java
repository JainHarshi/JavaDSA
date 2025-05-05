package Coaching.April30;

import java.util.Scanner;

public class CodeChef58 {
    	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    while(n-- >0){
	        int n1 = sc.nextInt();
	        int n2 = sc.nextInt();
	        int n3 = sc.nextInt();
	       if(n1 > n2 && n1>n3) System.out.println(("ALICE"));
	       else if(n2 > n1 && n2 > n3) System.out.println(("BOB"));
	       else if(n3>n1 && n3>n2) System.out.println(("Charlie"));
	       // else System.out.println("No");
	        
	   // }
	}
	}

    // Q-https://www.codechef.com/practice/course/basic-programming-concepts/DIFF500/problems/AUCTION
}
