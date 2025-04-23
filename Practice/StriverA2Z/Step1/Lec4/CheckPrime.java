package Practice.StriverA2Z.Step1.Lec4;

public class CheckPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(9));
        
    }
    public static boolean isPrime(int n) {
        for(int i =2 ; i<=Math.sqrt(n) ; i++){
          if(n%i == 0) return false;
        }
        return true;
  }
}
