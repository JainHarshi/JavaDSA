package Coaching.June11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,1,2,-1,-4};
      System.out.println(threeSum(nums));  
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        // List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> arr = new HashSet<>();
        for(int i =0 ; i< nums.length ; i++){
            for(int j =i+1 ; j< nums.length ; j++){
                for(int k = j+1 ; k < nums.length ; k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        // arr.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(triplet);
                        arr.add(triplet);

                    }
                }
            }
        }
        List<List<Integer>> result = new ArrayList<>(arr);

        return result;
    }
}
