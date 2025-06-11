package Coaching.June11;

public class MinimumSumofMountainTripletsIOptimised {
    public static void main(String[] args) {
        int[] nums = new int[] {8,6,1,5,3};
        System.out.println(minimumSum(nums));
    }

    public static int minimumSum(int[] nums) {
        int[] pre = new int[nums.length];
        int[] post = new int[nums.length];
        int n = nums.length-1;
        int sum = Integer.MAX_VALUE;
        pre[0] = nums[0];
        for(int i =1 ; i<nums.length ; i++){
            if(pre[i-1] > nums[i]){
                pre[i] = nums[i];
            }
            else{
                pre[i] = pre[i-1];
            }
        }
        post[n] = nums[n];
        for(int i = n-1 ; i>= 0 ; i--){
            if(post[i+1] > nums[i]){
                post[i] = nums[i];
            }
            else{
                post[i] = post[i+1];
            }
        }
        for(int i =1 ; i<n ; i++){
            if(pre[i] < nums[i] && post[i] < nums[i]){
                if(sum > nums[i] + post[i] + pre[i]){
                    sum = nums[i] + post[i] + pre[i];
                }
            }
        }
        return sum== Integer.MAX_VALUE ? -1 :sum;
    }
}

