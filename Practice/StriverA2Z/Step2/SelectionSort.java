package Practice.StriverA2Z.Step2;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0 ; i<n ; i++){
            System.out.println("Enter array value at " + i+1 + " position");
            arr[i] = sc.nextInt();
        }
        int rep = -1; 
        for(int i =0 ; i<n ; i++){
            boolean flag = false;
            int min = arr[i];
            for(int j =i+1 ; j < n ; j++){
                if(min > arr[j]){
                    min = arr[j];
                    rep =j;
                    flag = true;
                }
            }
            if(flag == true){
            int temp = arr[i];
            arr[i] = min;
            arr[rep] = temp;}

        }
        System.out.println(Arrays.toString(arr));

    }
}
