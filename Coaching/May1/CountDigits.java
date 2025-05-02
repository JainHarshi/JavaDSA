package Coaching.May1;

import java.util.*;




public class CountDigits {
    public static void main(String[] args) {
        int count =0;
        int n =1200;
        while(n>0){
            if((n%10)/2 != 0){
            count++;
            n /=10;}
        }
            
        
        System.out.println(count);
    }
}
