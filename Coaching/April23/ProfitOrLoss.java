package Coaching.April23;

import java.util.Scanner;

public class ProfitOrLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the Selling Price of your product ");
        int sp = sc.nextInt();
        System.out.println(" Enter the Cost Price of your product ");
        int cp = sc.nextInt();
        if( cp < sp) {
            System.out.println("Profit");
        }
        else if(cp > sp){
            System.out.println("Loss");
        }
        else{
            System.out.println(" No Profit No Loss ");
        }

    }
}
