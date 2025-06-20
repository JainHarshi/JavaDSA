package Practice.StriverA2Z.Step3.Lec2;

public class SortColorBest {
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
    public static void main(String[] args) {
        int arr[] = {2,0,2,1,1,0};
        sortColors(arr);
        System.out.println(arr);
    }
}
