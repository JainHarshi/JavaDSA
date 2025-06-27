package Coaching.June27;

import java.util.PriorityQueue;
import java.util.Collections;

public class BetterMaxEle {
    public static void max(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int ele : arr){
            pq.add(ele); // O(log n) per insert
        }
        System.out.println(pq.peek()); // return first most ele
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,2,4,3,2,13,1,3,1,3,1};
        max(arr);
    }
}
