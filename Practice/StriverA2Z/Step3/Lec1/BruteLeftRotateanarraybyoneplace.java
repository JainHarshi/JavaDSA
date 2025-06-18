package Practice.StriverA2Z.Step3.Lec1;

public class BruteLeftRotateanarraybyoneplace {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.print(rotate(arr, 3));
    }
    
    public static void rotate(int[] arr, int k) {
        int n = arr.length-1;
       for(int i =0 ; i<k ; i++){
        int temp = arr[n];
        for(int j = n ; j> 0 ; j-- ){
            arr[j] = arr[j-1];
        }
        arr[0] = temp;
       } 
    }

}
