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
        int min = Integer.MAX_VALUE;
        int rep = -1;
        for(int i =0 ; i<n ; i++){
            for(int j =i ; j < n-1 ; j++){
                if(arr[j] <arr[j+1]){
                    min = arr[j];
                    rep =j;
                }
            }
            int temp = arr[i];
            arr[i] = min;
            arr[rep] = temp;

        }
        System.out.println(Arrays.toString(arr));

    }
}
