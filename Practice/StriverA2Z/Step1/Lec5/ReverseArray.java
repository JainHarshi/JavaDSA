package Practice.StriverA2Z.Step1.Lec5;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
       System.out.println( Arrays.toString(m1(arr, 0, 4)));
    }
    public static int[] m1(int[] arr, int start, int end){
        int n = start;
        int m = end-1;
        if(n>= m) return arr;
        int temp = arr[n];
        arr[n] = arr[m];
        arr[m] = temp;
        return m1(arr, start+1, end-1);
        
    }
}
