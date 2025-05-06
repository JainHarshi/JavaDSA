package Practice.StriverA2Z.Step3;

public class LargestNo {
    public static void main(String[] args) {
      System.out.println(largestElement(new int[]{1,2,3,4,2}));  
    }
    public static int largestElement(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i =0 ; i<nums.length ; i++){
            if(max < nums[i])
            max = nums[i];
        }
    return max;
    }
}
