package Practice.StriverA2Z.Step3.Lec1;

import java.util.Arrays;

public class SortArrayBetter {
    public static void main(String[] args) {
        int nums[] = {2,0,2,1,1,0};
        sortColors(nums); 
        System.out.println(Arrays.toString(nums));
    }
    public static void sortColors(int[] nums) {
        int cnt0 =0;
        int cnt1 = 0;
        int cnt2 = 0;
        for(int i =0 ; i<nums.length ; i++){
            if(nums[i] == 0){
                cnt0++;
            }
            else if(nums[i] == 1){
                cnt1++;
            }
            else{
                cnt2++;
            }
        }
        for(int i =0 ; i<cnt0 ; i++){
            nums[i] = 0;
        }
        for(int i =cnt0 ; i<cnt0+cnt1 ; i++){
            nums[i] = 1;
        }
         for(int i =cnt0+cnt1 ; i<nums.length ; i++){
            nums[i] = 2;
        }
    }
}
