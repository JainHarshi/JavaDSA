package Practice.StriverA2Z.Step3.Lec1;

public class SingleNumber {
        public static int singleNumber(int[] nums) {
        int ans =0;
        for(int i =0 ; i<nums.length ; i++){
            ans ^= nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {2,2,1};
        System.out.println(singleNumber(nums));
    }
}
