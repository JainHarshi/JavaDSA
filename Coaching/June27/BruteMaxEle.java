package Coaching.June27;
import java.util.Arrays;

public class BruteMaxEle {
    public static void max(int arr[]){
        int n = arr.length;
        Arrays.sort(arr);
        System.out.println(arr[n-1]);

    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,2,4,3,2,13,1,3,1,3,1};
        max(arr);
    }
}
