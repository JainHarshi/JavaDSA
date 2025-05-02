package Coaching.May1;

public class SumOfOddEvenDigits {
    public static void main(String[] args) {
       
            int sum =0;
            int sum2 =0;
            int n =121;
            while(n>0){
                if((n%10)/2 != 0){
                sum += n%10;
                n/=10;
            }
            else{
                sum2 += n%10;
                n/=10; 
            }
                
            }
            System.out.println("Even" + sum);
            System.out.println("Odd"+ sum2);
        
    }
}
