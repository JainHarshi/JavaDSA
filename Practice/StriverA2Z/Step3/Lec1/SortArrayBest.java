package Practice.StriverA2Z.Step3.Lec1;

public class SortArrayBest {
    public static void main(String[] args ){
        int[] arr = {1,0,2,1,2,1,2,0};
        sortColors(arr);
        



    }
     public static void sortColors(int[] arr) {
        int n = arr.length;
        int mid = 0 ,  high = n-1,  low =0;
        while(mid <= high){
            if(arr[mid] == 0){
                swap(arr, mid , low);
                mid++;
                low++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else{
                swap(arr , mid, high);
                high--;
            }
        }

    }
    public static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
