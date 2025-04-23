package Coaching.April23;

import java.util.Scanner;

public class NoAlphaSpecialChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = s.charAt(0);
        if(c >= '1' && c <= '9'){
            System.out.println("No");
        }
         else if(c >= 'A' && c <= 'Z'){
            System.out.println("Alphabet");
        }
        else{
            System.out.println("Special Character");
        }

    }
}
