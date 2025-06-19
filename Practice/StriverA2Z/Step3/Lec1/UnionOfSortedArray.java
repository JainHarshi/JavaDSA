package Practice.StriverA2Z.Step3.Lec1;

import java.util.Arrays;

public class UnionOfSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 2, 7};
        int i =0;
        int j =0;
        int m =0;
        int[] ans = new int[nums1.length + nums2.length];
        while(i<nums1.length && j<nums2.length ){
            if(nums1[i] <= nums2[j]){
                ans[m++] = nums1[i];
                i++;
            }
            else{
                ans[m++] = nums2[j];
                j++;
            }
            
        }
        while(i<nums1.length){
            ans[m++] = nums1[i];
                i++;
        }
        while(j<nums2.length ){
            ans[m++] = nums2[j];
                j++;
        }

        System.out.println(Arrays.toString(ans));

    }
}
