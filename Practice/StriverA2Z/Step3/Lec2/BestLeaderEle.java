package Practice.StriverA2Z.Step3.Lec2;

import java.util.ArrayList;
import java.util.Collections;

public class BestLeaderEle {
    public static void main(String[] args) {
        int[] arr =  {16, 17, 4, 3, 5, 2};
      System.out.println(leaders(arr));  
    }
    // class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> al = new ArrayList<Integer>(); 
        int n = arr.length;
        int max = arr[n-1];
        al.add(max);
        for(int i =n-2 ; i>-1 ; i--){
            if(max <= arr[i]){
                al.add(arr[i]);
                max = arr[i];
            }
        }
        Collections.reverse(al);  // reverse in-place
        return al;   
        // return Collections.reverse(al);

    }
}
// }
