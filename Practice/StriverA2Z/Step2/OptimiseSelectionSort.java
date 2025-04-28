package Practice.StriverA2Z.Step2;

import java.util.Arrays;
import java.util.Scanner;

public class OptimiseSelectionSort {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0 ; i<n ; i++){
            // System.out.println("Enter array value at " + i+1 + " position");
            System.out.println("Enter array value at " + (i+1) + " position");
            arr[i] = sc.nextInt();
        }
        int mini; 
        for(int i =0 ; i<n ; i++){
            // boolean flag = false; optimise by removal of no use of repetative swaps by extra flag variable
             mini = i;
            for(int j =i+1 ; j < n ; j++){
                if(arr[mini] > arr[j]){
                    mini = j;
                    // rep =j;
                    // flag = true; optimise by removal of no use of repetative swaps by extra flag variable
                }
            }
            // if(flag == true){  optimise by removal of no use of repetative swaps by extra flag variable
            if(mini != i){
            int temp = arr[i];
            arr[i] = arr[mini];
            arr[mini] = temp;}

        }
        System.out.println(Arrays.toString(arr));  
    }
}
