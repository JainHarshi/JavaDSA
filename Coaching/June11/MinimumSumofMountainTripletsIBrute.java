package Coaching.June11;

public class MinimumSumofMountainTripletsIBrute {
    public static void main(String[] args) {
        int[] nums = new int[]{8,6,1,5,3};
        System.out.println(minimumSum(nums));
        
    }
    public static int minimumSum(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i =0 ;i< nums.length-2 ; i++){
            for(int j =i ;j< nums.length-1 ; j++){
                for(int k =j ;k< nums.length ; k++){
                    if(nums[i] < nums[j] && nums[k] < nums[j]){
                        if(min > nums[i] + nums[j] + nums[k]){
                            min = nums[i] + nums[j] + nums[k];
                        }
                    }

        }

        }

        }
       return min== Integer.MAX_VALUE ? -1 : min ; 
    }
}
