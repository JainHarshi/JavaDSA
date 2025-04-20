package Practice.StriverA2Z.Step1.Lec4;

public class ReverseDigit {
    public static void main(String[] args) {
       System.out.println(reverseNumber(10)); 
    }
    public static int reverseNumber(int n) {
        int req =0;
        while(n>0){
        int rem = n%10;
        req = req*10 + rem;
        n = n/10;}
        return req;

    }
}
