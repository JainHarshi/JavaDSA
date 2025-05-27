public class LowerBoundBrute {
    public static void main(String[] args) {
        System.out.println(lowerBound(new int[]{1,2,3,4,4}, 4)); 

    }
    public static int lowerBound(int[] nums, int x) {
        int ans = -1;
       for(int i =0 ; i<nums.length ; i++){
        if(nums[i] >= x){
            ans = i;
            break;
        }
       }
       return ans;
     }
    //  https://takeuforward.org/plus/dsa/problems/lower-bound-
    
}
