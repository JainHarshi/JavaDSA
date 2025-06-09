package Coaching.June9;

public class StrongNo {
    public static void main(String[] args) {
        int n =2;
        int ans =0;
        int temp =n;
        while(n>0){
            ans += fact(n%10);
            n /= 10;
        }
        System.out.println(ans == temp ? "Strong No": "Non Strong No");
    }
    public static int fact(int n){
        int ans =1;
        for(int i =1 ; i<= n ; i++){
            ans *= i;
        }
        return ans;
    }
}
