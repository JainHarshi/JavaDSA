package Coaching.April30;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CodeChef86 {
   	public static void main(String[] args) {
		// System.in and System.out are input and output streams, respectively.
		InputStream inputStream = System.in;

		// InputStreamReader in = new InputReader(inputStream);
        Scanner in = new Scanner(inputStream);

		int n = in.nextInt();
		int k = in.nextInt();
		
		int ans = 0;
		
		for (int i = 0; i < n; i++) {
			int x = in.nextInt();
			
			if (x % k == 0) {
				ans++;
			}
		}

		System.out.println(ans);
	} 
}

// Q- https://www.codechef.com/practice/course/basic-programming-concepts/DIFF500/problems/INTEST
