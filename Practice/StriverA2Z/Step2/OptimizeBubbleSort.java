package Practice.StriverA2Z.Step2;

import java.util.*;

public class OptimizeBubbleSort {
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
        for(int i =0 ; i<n-1 ; i++){
            boolean swap = false;
            for(int j = 0 ; j<n-1-i ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;


                }
            }
            if(swap == false) break;
        }
        System.out.println(Arrays.toString(arr));
        
    }
}
