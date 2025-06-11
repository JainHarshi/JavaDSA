package Practice.StriverA2Z.Step2.Lec2;

import java.util.ArrayList;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = new int[]{5, 3, 1, 4, 2};  // You can change this input

        int low = 0;
        int right = arr.length - 1;

        merge(low, right, arr);

        // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void merge(int low, int high, int[] arr) {
        if (low >= high) return;  // Base case: one element

        int mid = (low + high) / 2;

        merge(low, mid, arr);         // Sort left half
        merge(mid + 1, high, arr);    // Sort right half
        merging(low, mid, high, arr); // Merge both
    }

    public static void merging(int low, int mid, int high, int[] arr) {
        int left = low;
        int right = mid + 1;

        ArrayList<Integer> temp = new ArrayList<>();

        // Merge two sorted halves
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // Add remaining elements from left half
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        // Add remaining elements from right half
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // Copy sorted temp array back to original array
        for (int i = 0; i < temp.size(); i++) {
            arr[low + i] = temp.get(i);
        }
    }
}
