package Practice.StriverA2Z.Step1.Lec4;

public class CheckPalindrome {
    public static void main(String[] args) {
        System.out.println();
        int n = 111;
        int p =n;
        int rem = 0;
        while(n>0){
            int r = n%10;
            rem = rem*10 +r;
            n = n/10;
        }
        System.out.println(rem);
        if(rem == p) System.out.println("True");
        else System.out.println("False");
    }
}
