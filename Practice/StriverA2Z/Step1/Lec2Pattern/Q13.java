package Practice.StriverA2Z.Step1.Lec2Pattern;

public class Q13 {
    
        public static void main(String[] args) {
            int n = 5;
            int p = 1;
    
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(p++ + " ");
                }
                System.out.println();
            }
        }
    
    
}
