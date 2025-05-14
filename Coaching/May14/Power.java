package Coaching.May14;

public class Power {
    public static void main(String[] args) {
        int count =0;
        int n = 123;
        int temp =3;
        int sol =1;
        while(n>0){
            count++;
            n =n/10;
        }
        for(int i =0 ; i<count ; i++){
            sol *= temp;
        }
        System.out.println(sol);
    }
}
