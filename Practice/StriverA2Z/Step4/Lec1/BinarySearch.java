
public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(search(new int[]{1,2,3,4}, 4)); 
 
    }
    public static int search(int[] nums, int target) {
        int s =0;
        int e = nums.length-1;
        while(e>= s){
            int mid = s + ((e-s)/2);
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                e= mid-1;
            }
            else{
                s = mid+1;
            }
        }
        return -1;
        
    }
}
