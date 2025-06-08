package Practice.KunalRecursion;

import java.util.Arrays;

public class SelectionSortRecursion {
    public static void main(String[] args) {
        int[] arr = new int[]{1,5,2,4,5};
        int temp[] = new int[arr.length];
        selection(arr, arr.length, 0, -2147483648,temp);
        System.out.println(Arrays.toString(arr));
    }
    public static void selection(int[] arr, int r , int c, int max , int[] temp){
        
        
        System.out.println("from function temp " +Arrays.toString(temp));
        System.out.println("from function Array " +Arrays.toString(arr));
        if(r== 0) return;
        int h =0;


        if(r>c){

            if(arr[c] > max){
                max = arr[c];
                h = c;
                System.out.println("Value of " + h);

                
            }
            selection(arr, r, c+1,max,temp);
           
        }
         else{
              swap(arr, h, c-1);
              temp[c-1] = max;
              System.out.println("from function temp change value" +Arrays.toString(temp));

            //   max= Integer.MIN_VALUE;
              selection(arr, r-1, 0,Integer.MIN_VALUE,temp);  
            }
            System.out.println("from function temp " +Arrays.toString(temp));
            System.out.println("from function Array " +Arrays.toString(arr));
            int p =0;
            for(int n1 : temp){
                arr[p++] = n1;
            }
          
    }
      public static void swap(int[] arr , int n , int m){
              int temp = arr[n];
              arr[n] = arr[m];
              arr[m] = temp;  
            }

}
