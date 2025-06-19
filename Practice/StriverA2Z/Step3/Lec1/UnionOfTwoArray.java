package Practice.StriverA2Z.Step3.Lec1;

import java.util.Arrays;

public class UnionOfTwoArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,4,2,4,1,3};
        int[] arr2 = new int[]{1,2,4,2,4,1,3};
        int n1 = arr.length;
        int n2 = arr2.length;
        int m =0;
        int n =0;
        int[] ans = new int[n1+n2];
        while(n1>0){
            ans[n++] = arr[m++];
            n1--;
        }
        int m1 =0;
        while(n2>0){
            ans[n++] = arr2[m1++];
            n2--;
        }
        System.out.println(Arrays.toString(ans));
    }
}
