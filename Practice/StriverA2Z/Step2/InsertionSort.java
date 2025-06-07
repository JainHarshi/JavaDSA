package Practice.StriverA2Z.Step2;

import java.util.Arrays;

public class InsertionSort {
    
    public static void main(String args[]){
        // int[] arr = new int[]{1,1,3,4,5};
        // int[] arr = new int[]{10, 1, 2, 3, 4};
        // int[] arr = new int[]{10, 9, 8, 7, 6, 5};
        // int[] arr = new int[]{4, 2, 1, 3};
        // int[] arr = new int[]{3, 5, 4, 1, 2};
        int[] arr = new int[]{2, 1, 4, 3, 6, 5, 8, 7, 10, 9};





        // int[] arr = new int[]{5, 4, 3, 2, 1};

        int n = arr.length;
        for(int i =1 ; i<n ; i++){
            while(i<n  && i>0 && arr[i-1] > arr[i] ){
                swap(arr,i-1, i);
                i =i-1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr, int n , int m){
        int temp = arr[n];
        arr[n] =arr[m];
        arr[m] = temp;
    }
}
