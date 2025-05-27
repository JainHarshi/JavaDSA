public class LowerBound {
    public static void main(String[] args) {
        System.out.println(lowerBound(new int[]{1,2,3,4,4}, 4)); 

    }
    public static int lowerBound(int[] nums, int x) {
      int s = 0;
      int e = nums.length-1;
      int ans =-1;
      while(e>= s){
        int mid = s+(e-s)/2;
        if(nums[mid] >= x){ ans = mid;
        e = mid-1;
        }
        else{
            s = mid+1;
        }
      } 
      return ans;
     }
    //  https://takeuforward.org/plus/dsa/problems/lower-bound-
    
}
