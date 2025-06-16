package Practice.StriverA2Z.Step3.Lec1;

public class LargestNoInArray {
    public static void main(String[] args) {
        int[] arr = new int[]{0,3,5,1,3,2};
        int max = Integer.MIN_VALUE;
        for(int i =0 ; i<arr.length ; i++){
            if(max<arr[i]){
                max= arr[i];
            }
        }
        System.out.println(arr);
    }
}
