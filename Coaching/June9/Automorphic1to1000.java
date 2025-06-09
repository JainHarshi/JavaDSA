package Coaching.June9;

public class Automorphic1to1000 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            int n = i;
            int pow = n * n;
            int count = 0;
            int temp = n;

            while (n > 0) {
                count++;
                n /= 10;
            }
            int modNo = (int) Math.pow(10, count);
            int reqAns = pow % modNo;
            System.out.println(reqAns == temp ? i + " Automorphic No." : i + " Non Automorphic No. ");

        }
    }
}
