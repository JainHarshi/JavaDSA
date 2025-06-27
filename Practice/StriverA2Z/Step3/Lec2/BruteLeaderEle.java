package Practice.StriverA2Z.Step3.Lec2;

import java.util.ArrayList;
import java.util.Collections;

public class BruteLeaderEle {
    public static void main(String[] args) {
        int[] arr =  {16, 17, 4, 3, 5, 2};
        System.out.println(leaders( arr));
    }
    

// import java.util.ArrayList;
// import java.util.Collections;

// class Solution {
    // Function to find the leaders in the array.
    static ArrayList<Integer> leaders( int arr[]) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        int num = arr[arr.length-1];
        al.add(num);
        for(int i = arr.length-2 ; i >-1 ; i-- ){
            if(num <= arr[i]){
                al.add(arr[i]);
                num = arr[i];
            }
        }
        Collections.reverse(al);
        return al;
    }
}
// }
