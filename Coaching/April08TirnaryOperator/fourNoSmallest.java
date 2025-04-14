package Coaching.April08TirnaryOperator;
import java.util.*;

public class fourNoSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int e = a>b ? b : a;
        int f = c>d ? d : c;
        System.out.println(e>f ? f : e);
    }
}
