package Coaching.till04_Java;
// to print all digit of number
class M105{
    public static void main(String[] args) {
        System.out.println("Hi");
        int n = 25;
        // int x = n%10;
        // n /= 10;
        // System.out.println(x);
        // System.out.println(n);
        while(n != 0){
            System.out.println(n%10);
            n /= 10;
            
        }
    }}