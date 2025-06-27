package Coaching.June27;

public class BestMaxEle {
    public static void max(int[] arr){
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i =0 ; i<n ; i++){
            if(max< arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Max With Ele of Array " + max);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,2,4,3,2,13,1,3,1,3,1};
        max(arr);
    }
}
