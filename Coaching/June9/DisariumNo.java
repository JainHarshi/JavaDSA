package Coaching.June9;

public class DisariumNo {
    public static void main(String[] args) {
        int n =75;
        int count =0;
        int temp = n;
        int ans =0;
        int temp2 = n; 

        while(n>0){
            count++;
            n /= 10;
        }
        while(temp >0){
            ans += (int)Math.pow(temp%10, count--);
            temp /= 10;
        }
        System.out.println(temp2 == ans ? "Disarium No ": "Non Disarium No");

    }
}
