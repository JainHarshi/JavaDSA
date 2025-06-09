package Coaching.June9;

public class AutomorphicNo {
    public static void main(String[] args) {
        int n = 761;
        int pow = n*n;
        int count =0;
        int temp =n;

        while(n>0){
            count++;
            n /= 10;
        }
        int modNo = (int)Math.pow(10,count);
        int reqAns = pow%modNo;
        System.out.println(reqAns == temp ? " Automorphic No." : "Non Automorphic No. ");

    }
}
