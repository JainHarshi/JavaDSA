package Practice.StriverA2Z.Step3.Lec1;

public class CheckArrayIsSorted {
    public static void main(String[] args) {
        int[] arr = new int[]{10,23,40};
        for(int i =1 ; i<arr.length-1 ; i++){
            if(arr[i] < arr[i-1] || arr[i+1]< arr[i]){
                System.out.println("FALSE");
                return;

            }
            

        }
        System.out.println("true");
    }
}
