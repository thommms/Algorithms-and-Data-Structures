package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Find the shortest distance in an array,
 * given [3,6,12,7, 20]. The shortest distance here is 1, which is 6 to 7.
 */
public class ShortestDistanceInArray {
    public static void quicksort(int[] array) {
        quicksort(array, 0, array.length - 1);
    }

    private static void quicksort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }
        int pivot = array[(left + right) / 2];
        int index = partition(array, left, right, pivot);
        quicksort(array, left, index - 1);
        quicksort(array, index, right);
    }

    private static int partition(int[] array, int left, int right, int pivot) {
        while (left <= right) {
            while (array[left] < pivot) {
                left++;
            }
            while (array[right] > pivot) {
                right--;
            }
            if (left <= right) {
                swap(array, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    private static void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 12, 7, 20};
        boolean sorted = false;
        int temp=0;

        quicksort(arr);

//        while (!sorted) {
//            sorted = true;
//            for (int k = 0; k < arr.length - 1; k++) {
//                if (arr[k] > arr[k + 1]) {
//                    temp = arr[k];
//                    arr[k] = arr[k + 1];
//                    arr[k+1]= temp;
//                    sorted = false;
//                }
//            }
//        }
        System.out.println(Arrays.toString(arr));
        int x = 0;
        int y = 0;
        int add = arr[1] - arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            if (add > arr[i + 1] - arr[i]) {
                add = arr[i + 1] - arr[i];
                x = arr[i + 1];
                y = arr[i];
            }
        }
        System.out.println(y + "," + x + " with diff: " + add);
    }
//
//        int length = arr.length;
//        int min = Math.abs(arr[length] - arr[0]);
//        int current;
//        for (int i = 0; i <= length; i++) {
//            for (int j = (i + 1); j <= length; j++) {
//                current = Math.abs(arr[j] - arr[i]);
//                if (current < min){
//                    min = current;
//                }
//            }
//        }
//        System.out.println(min);
//    }
}
