package Coaching.May14;

public class Strong {
    public static void main(String[] args) {
        int n =123;
        int p =0;
        int ans =0;
        while(n>0){
            p = n%10;
            int sum =1;
            for(int i =1; i<=p ; i++){
                sum *= i;
            }
            ans +=sum;
            n = n/10;


        }
        System.out.println(ans);
    }
}
