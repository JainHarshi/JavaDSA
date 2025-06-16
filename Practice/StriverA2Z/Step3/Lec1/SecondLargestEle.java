package Practice.StriverA2Z.Step3.Lec1;

public class SecondLargestEle {
    public static void main(String[] args) {
        int[] arr = new int[]{0,3,5,1,3,2};
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int i =0 ; i<arr.length ; i++){
            if(max<arr[i]){
                max= arr[i];
            }
        }
        for(int i =0 ; i<arr.length ; i++){
            if(max2 < arr[i] && max != arr[i]){
                max2= arr[i];
            }
        } 
        System.out.println(max2);
       }
}
