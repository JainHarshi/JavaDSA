package Coaching.June9;

public class Pallindrome1to1000 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            int n =i;
            
            int ans = 0;
            int temp = n;
            while (n > 0) {
                ans = ans * 10 + n % 10;
                n = n / 10;
            }
            System.out.println(ans == temp ? i + " Pallindrome" : i + " Non Pallindrome");
            n = temp;
        }
    }
}
