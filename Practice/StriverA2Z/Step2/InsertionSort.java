package Practice.StriverA2Z.Step2;

import java.util.Arrays;

public class InsertionSort {
    
    public static void main(String args[]){
        int[] arr = new int[]{1,2,8,3,1};
        int n = arr.length;
        for(int i =0 ; i<n-1 ; i++){
            while(arr[i+1]< arr[i] && i<n-1){
                swap(arr[i+1], arr[i]);
                i =i-1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int n , int m){
        int temp = n;
        n =m;
        m = temp;
    }
}
