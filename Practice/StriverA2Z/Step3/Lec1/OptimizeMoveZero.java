package Practice.StriverA2Z.Step3.Lec1;

public class OptimizeMoveZero {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,5,0,1,2,0,5,0,7,0,0,9};
        System.out.println(moveZeroes(arr));
    }
    public static void moveZeroes(int[] arr) {
       int i =0;
       int j = 1;
       while(j<arr.length){
        if(arr[i] == 0 && arr[j] != 0){
            swap(arr, i, j);
        }
        else if(arr[i] ==0 && arr[j] == 0){
            j++;
        }
        else{
            i++;
            j++;
        }
       } 
    }
    public static void swap(int[] nums , int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
