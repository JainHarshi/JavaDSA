package Coaching.June9;

public class HarshadNo {
//     Example:
// 18 is a Harshad Number because:

// Sum of digits = 1 + 8 = 9

// 18 ÷ 9 = 2 (which is a whole number)

// 21 is not a Harshad Number:

// 2 + 1 = 3

// 21 ÷ 3 = 7 → Yes! So actually, 21 is also a Harshad Number

// Let’s try a non-Harshad one:

// 19

// 1 + 9 = 10

// 19 ÷ 10 = 1.9 → Not an integer → Not a Harshad Number
    public static void main(String[] args) {
        // int n = 18;
        int n = 118;

        int sum =0;
        int temp = n;
        while(n>0){
            sum += n%10;
            n = n/10;
        }
        String ans = temp%sum == 0 ? "Harshad No" : "Non Harshad No";
        System.out.println(ans);

    }
}
