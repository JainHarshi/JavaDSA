package Practice.StriverA2Z.Step1.Lec5;

import java.util.Arrays;

public class ReverseArrayBrute {
    public static void main(String[] args) {
      int arr[] = {1,2,3,4,5};
      int n =0;
      int m = arr.length-1;
    //   if(n>= m) {System.out.println( arr[0]);
   
    while(m>n){
      int temp = arr[n];
      arr[n] = arr[m];
      arr[m] = temp;  
      n++;
      m--;
    }
    if(n>= m) {System.out.println( Arrays.toString(arr));}
}
}
