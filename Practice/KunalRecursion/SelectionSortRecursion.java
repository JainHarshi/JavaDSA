package Practice.KunalRecursion;

import java.util.Arrays;

public class SelectionSortRecursion {
    public static void main(String[] args) {
        int[] arr = new int[]{1,5,2,4,5};
        selection(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }
    public static void selection(int[] arr, int r , int c){
        int temp[] = new int[arr.length-1];
        int max= Integer.MIN_VALUE;


        if(r>c){
            if(arr[c] > max){
                max = arr[c];
                
                
            }
            selection(arr, r, c+1);
           
        }
         else{
              temp[c] = max;
              max= Integer.MIN_VALUE;
              selection(arr, r-1, c);  
            }
            int p =0;
            for(int n1 : temp){
                arr[p++] = n1;
            }
    }

}
