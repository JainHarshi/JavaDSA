package Practice.StriverA2Z.Step3.Lec1;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,4,2,4,1,3};
        int k = 9;
        for(int i =0 ; i<arr.length ; i++){

            if(arr[i] == k){
                System.out.println(i);
                return;
            }
        }
        System.out.println("Sorry Baby🤷‍♂️");
    }
}
