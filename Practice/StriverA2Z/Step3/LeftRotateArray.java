package Practice.StriverA2Z.Step3;

import java.util.Arrays;

public class LeftRotateArray {
    public static void main(String[] args) {
        int n[] = new int[] {1,2,3,4,5};
      rotateArrayByOne(n);  
      System.out.println(Arrays.toString(n));

    }
    public static void rotateArrayByOne(int[] nums) {
        int temp = nums[0];
        int n = nums.length-1;
        for(int i =0 ; i<n ; i++){
            nums[i] = nums[i+1];

        }
        nums[n] = temp;
    }
}
