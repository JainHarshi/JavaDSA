package Practice.StriverA2Z.Step3.Lec1;

import java.util.LinkedHashSet;
import java.util.Set;

public class OptimiseRemoveDuplicateFromArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,2};
       System.out.println(removeDuplicates(arr)); 
    }
    public static int removeDuplicates(int[] nums) {
      Set<Integer> unique = new LinkedHashSet<Integer>();
      for(int n : nums){
        unique.add(n);
      }
      int i =0;
      for(int n : unique){
        nums[i++] = n;
      } 
      return i; 
    }
}
