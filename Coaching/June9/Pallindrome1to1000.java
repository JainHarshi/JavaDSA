package Coaching.June9;

public class Pallindrome1to1000 {
    public static void main(String[] args) {
        for (int n = 1; n <= 1000; n++) {
            
            int ans = 0;
            int temp = n;
            while (n > 0) {
                ans = ans * 10 + n % 10;
                n = n / 10;
            }
            System.out.println(ans == temp ? n + " Pallindrome" : n + " Non Pallindrome");
            n = temp;
        }
    }
}
