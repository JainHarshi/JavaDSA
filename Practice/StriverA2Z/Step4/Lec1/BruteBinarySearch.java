public class BruteBinarySearch {
    public static void main(String[] args) {
       System.out.println(search(new int[]{1,2,3,4}, 4)); 
    }
        public static int search(int[] nums, int target) {
        for(int i =0 ; i<nums.length ; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }
}
