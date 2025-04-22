package Practice.StriverA2Z.Step1.Lec5;

public class Print1ToN {
    public static void main(String[] args) {
        m1(5);
    }
    public static void m1(int n) {
        if(n == 0)return;
        m1(n--);
        System.out.println(n);
    }
}
