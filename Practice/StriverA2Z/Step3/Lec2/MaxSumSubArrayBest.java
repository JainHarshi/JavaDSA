package Practice.StriverA2Z.Step3.Lec2;

public class MaxSumSubArrayBest {
    public static void main(String[] args) {
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
       System.out.println(maxSubArray(nums)); 
    }
    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum =0;
        for(int i =0 ; i<nums.length ; i++){
            sum += nums[i];
            

            if(sum > max){
                max = sum;
            }
            if(sum < 0){
                sum =0;
            }
        }
        return max;
    }
}
