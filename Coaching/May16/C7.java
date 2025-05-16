package Coaching.May16;

import java.util.Scanner;

public class C7 {
    	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    while(n-- >0){
	        int n1 = sc.nextInt();
	        int n2 = sc.nextInt();
	        int n3 = sc.nextInt();
	        if((n1 == 1 && n2==0 & n3==0) || (n1 == 0 && n2==0 & n3==0) ||(n1 == 0 && n2==1 & n3==0) || (n1 == 0 && n2==0 & n3==1))System.out.println("Water filling time");
	        else System.out.println("Not now");}}
}
