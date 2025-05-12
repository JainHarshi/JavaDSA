package Coaching.May12;

public class CountFactor {
    public static void main(String[] args) {
        int n = 20;
        int count=1;
        for(int i =2 ; i<=n ; i++){
            if(n%i == 0) count++;
        }
        System.out.println(count);
    }
}
