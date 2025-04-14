package Practice.StriverA2Z.Step1.Lec2Pattern;

public class Q15 {
    
        public static void main(String[] args) {
            int n = 5;
    
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - i; j++) {
                    System.out.print((char)(65 + j) + " ");
                }
                System.out.println();
            }
        }
    
    
}
