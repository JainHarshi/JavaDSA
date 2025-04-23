package Practice.StriverA2Z.Step1.Lec5;

public class SumOfN {
    public static void main(String[] args) {
     System.out.println(NnumbersSum(4));   
    }
    public static int NnumbersSum(int N) {
      if(N == 0) return 0;
      return N + NnumbersSum(N-1);
  }
}
