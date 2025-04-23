package Practice.StriverA2Z.Step1.Lec4;

import java.util.Scanner;

public class ArmsStrongBrute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count =0;
        int check;
        int original = check = n;
        int sum =0;
        while(n>0){
            count++;
            n/=10;
        }
        while(original >0){
            sum += Math.pow(original%10, count);
            original /= 10;
        }
        System.out.println(sum);
        System.out.println(sum == check);

    }
}
