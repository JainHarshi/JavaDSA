package Practice.StriverA2Z.Step1.Lec5;

import java.util.HashMap;

public class FreqOfArrayEle {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int arr[] = {1,2,3,4,4};
        for(int i =0 ;i<arr.length ; i++){
            hm.put(arr[i], hm.getOrDefault(arr[0], 0)+ 1);
        }
        System.out.println(hm);
    }
}
