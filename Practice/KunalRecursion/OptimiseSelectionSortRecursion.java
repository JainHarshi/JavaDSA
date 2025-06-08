
package Practice.KunalRecursion;

import java.util.Arrays;

public class OptimiseSelectionSortRecursion{
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 4, 5};
        selectionSort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr, int r, int c, int maxIndex) {
        if (r == 0) return;

        if (c < r) {
            if (arr[c] > arr[maxIndex]) {
                selectionSort(arr, r, c + 1, c);  // Found new max
            } else {
                selectionSort(arr, r, c + 1, maxIndex);
            }
        } else {
            // Put max at the end of the range
            swap(arr, maxIndex, r - 1);
            selectionSort(arr, r - 1, 0, 0); // Reduce range
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}


