package Practice.StriverA2Z.Step2.Lec2;

import java.util.ArrayList;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5};
        int low = arr[0];
        int right = arr[arr.length-1];
        merge(low, right, arr);


        
    }
    public static void merge(int low , int high , int[] arr){
         low = 0;
         high = arr.length-1;
         int mid = (low+high)/2;
         if(low >high) return;
         merge(low, mid, arr);
         merge(mid+1 , high , arr);
         merging(low, mid, high, arr);
    }
    public static void merging(int low , int mid, int high , int[] arr){
        int left = low;
        int right = mid+1;
        ArrayList<Integer> temp = new ArrayList<Integer>();
        while(left <= mid && right <= high ){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right--;
            }

            while(left <= mid){
               temp.add(arr[left]);
                left++; 
            }
            while (right <= high) {
                temp.add(arr[right]);
                right--;
            }
            for(int n =0; n<arr.length ; n++ ){
                arr[n] = temp.get(n - low);
            }

        }
    }
}
