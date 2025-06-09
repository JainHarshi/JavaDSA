package Coaching.June9;

public class Pallindrome {
   public static void main(String[] args) {
    int n = 131;
    int ans =0;
    int temp = n;
    while(n>0){
        ans= ans*10 + n%10;
        n = n/10; 
    }
    System.out.println(ans == temp ? "Pallindrome" : "Non Pallindrome");
   } 
}
