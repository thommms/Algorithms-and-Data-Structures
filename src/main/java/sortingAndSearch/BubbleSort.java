package sortingAndSearch;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int temp;
        int[] arr = {1, 3, 5, 2, 6, 3, 7, 3, 8};
        boolean sorted = false;

        while (!sorted) {
            sorted=true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    sorted = false;
                }
             }
        }
        System.out.println(Arrays.toString(arr));
    }
}
