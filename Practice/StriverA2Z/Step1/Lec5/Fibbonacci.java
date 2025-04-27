package Practice.StriverA2Z.Step1.Lec5;

import java.util.Scanner;

public class Fibbonacci {
    public static void main(String[] args) {
        int count =0;
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int n =0;
        int m = 1;
        while(count != p){
            System.out.println("n "+n);
            System.out.println("m " + m);
            n = n+m;
            count++;}
        // System.out.println(m);
        // System.out.println(n);
    }
}
