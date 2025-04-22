package Practice.StriverA2Z.Step1.Lec5;

public class PrintNameNTimes {
    public static void main(String[] args) {
        m1(5);
    }
    public static void m1(int n){
        if(n ==0)return;
        System.out.println("Harshi Jain");
        m1(n-1);
    }
}
