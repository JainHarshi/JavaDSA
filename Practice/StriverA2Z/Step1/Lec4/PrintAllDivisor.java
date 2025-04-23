package Practice.StriverA2Z.Step1.Lec4;
import java.util.*;

public class PrintAllDivisor {
    public static void main(String[] args) {
        System.out.println(divisors(8));
    }

    public static int[] divisors(int n) {
        // int n =8;
        ArrayList<Integer> ar = new ArrayList<Integer>();
        for(int i =1; i<= n ; i++){
            if(n%i == 0){
                ar.add(i);
            }
        }
        // System.out.println(ar);
        int[] result = new int[ar.size()];
        for (int i = 0; i < ar.size(); i++) {
            result[i] = ar.get(i);
        }

        return result;

    }
}
