package Practice.StriverA2Z.Step1.Lec4;

public class GcdOrHCFBrute {
    public static void main(String[] args) {
        int gcd =0;
        int a =5;
        int b =15;
        for(int i =1 ; i<= Math.min(a,b) ; i++){
            if(a%i == 0 && b%i == 0){
                gcd = i;
            }
        }
        System.out.println(gcd);
    }
}
