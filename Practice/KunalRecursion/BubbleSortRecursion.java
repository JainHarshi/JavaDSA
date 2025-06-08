package Practice.KunalRecursion;

import java.util.Arrays;

public class BubbleSortRecursion {
    public static void main(String[] args) {
        // int[] arr = new int[]{4,5,2,3};
        int[] arr = new int[]{4,5,2,1,3,1,5,4,3,2,2,1,3};
        bubbleSort(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int[] arr , int r, int c){
        if(r==0) return;
        if(r>c){
            if(arr[c]> arr[c+1]){
            swap(arr,c, c+1);

        }
        bubbleSort(arr, r, c+1);}
        else{
            bubbleSort(arr, r-1, 0);


        }

    }
    public static void swap(int[] arr , int n , int m){
        int temp = arr[n];
        arr[n] = arr[m];
        arr[m] = temp;
    }
}
