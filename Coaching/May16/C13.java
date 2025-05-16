

package Coaching.May16;

import java.util.Scanner;

public class C13 {public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    while(n-- >0){
	        int n1 = sc.nextInt();
	        int n2 = sc.nextInt();
	        int n3 = sc.nextInt();
	        int n4 = sc.nextInt();
	        if(n1>(n2+n3+n4) || n2>(n1+n3+n4) || n3>(n1+n2+n4) 
	        || n4>(n1+n3+n2) )System.out.println("YES");
	        else System.out.println("NO");
}}}