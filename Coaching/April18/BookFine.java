package Coaching.April18;

public class BookFine {
    public static void main(String[] args) {

        int amt = 42;
        if (amt <= 15)
            System.out.println("Fine no");

        if (amt > 40)
            System.out.println("Membership cancel");
        if (amt >= 16 && amt <= 25) {

            amt = amt - 15;
            System.out.println(amt * 5);

        }
        if (amt >= 26 && amt <= 35) {
            amt = amt - 25;
            System.out.println(amt * 10 + 50);

        }
        if (amt >= 36 && amt <= 40) {
            amt = amt - 35;
            System.out.println(amt * 15 + 150);

        }

    }
}
