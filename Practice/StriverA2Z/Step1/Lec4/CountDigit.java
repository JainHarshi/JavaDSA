package Practice.StriverA2Z.Step1.Lec4;

public class CountDigit {

    public static void main(String[] args) {
        System.out.println(countDigit(0));
    }
    public static int countDigit(int n) {
        int count =0;
        if(n ==0) return 1;
        while(n>0){
            count++;
            n = n/10;
        }
        return count;

    }
}