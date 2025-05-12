package Coaching.May12;

public class Prime {
    public static void main(String[] args) {
        int n = 7;
        // int count=1;
        for(int i =2 ; i<n ; i++){
            if(n%i == 0) {System.out.println("NonPrime");
            return;}
        }
        System.out.println("Prime");
    }
}
