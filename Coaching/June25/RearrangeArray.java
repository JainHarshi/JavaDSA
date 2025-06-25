package Coaching.June25;

public class RearrangeArray {
    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int pos[] = new int[n/2];
        int neg[] = new int[n/2];
        int p = 0;
        int n1 = 0;
        for(int i =0 ; i<n ; i++){
            if(nums[i] > 0){
                pos[p++] = nums[i];
            }
            else{
               neg[n1++] = nums[i]; 
            }

        }
        p=0;
        n1=0;
        for(int i = 0 ; i<n ; i++){
            if(i%2 == 0){
            nums[i] = pos[p++];}
            else{
                nums[i] = neg[n1++];
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(rearrangeArray(prices));
    }
}
