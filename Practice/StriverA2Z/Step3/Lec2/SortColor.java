package Practice.StriverA2Z.Step3.Lec2;

import java.util.Arrays;

public class SortColor {
    public static void main(String[] args) {
        int[] nums = {2,2,1};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
        public static void sortColors(int[] nums) {
        Arrays.sort(nums);
    }
}
