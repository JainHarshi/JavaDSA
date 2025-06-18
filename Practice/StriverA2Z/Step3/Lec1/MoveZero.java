package Practice.StriverA2Z.Step3.Lec1;

public class MoveZero {
    public static void main(String[] args) {
       System.out.println(moveZeroes(new int[] {1,0,2,03,2})); 
    }
    
    public static void moveZeroes(int[] arr) {
        int[] ans = new int[arr.length];
        int m =0;
        for(int i =0 ; i<arr.length ; i++){
            if(arr[i] != 0){
                ans[m++] = arr[i];
            }
        }
        for(int i =0 ; i<arr.length ; i++){
            arr[i] =ans[i];
        }
    }

}
