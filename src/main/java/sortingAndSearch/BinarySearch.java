package sortingAndSearch;

import java.util.Arrays;

public class BinarySearch {
    public static boolean BinarySearchRecursive(int[] array, int x) {
        return BinarySearchRecursive(array, x, 0, array.length - 1);
    }

    private static boolean BinarySearchRecursive(int[] array, int x, int left, int right) {
        if (left > right) {
            return false;
        }
        int mid = left + ((right-left) / 2);
        if (array[mid] == x) {
            return true;
        } else if (x < array[mid]) {
            return BinarySearchRecursive(array, x, left, mid - 1);
        } else {
            return BinarySearchRecursive(array, x, mid + 1, right);
        }

        //ALTERNATIVELY
//        if (left < right) {
//            int middle = left + (right - left) / 2;
//            if(x < array[middle]) {
//                return BinarySearchRecursive(array, left, middle, x);
//            } else if (x > array[middle]) {
//                return BinarySearchRecursive(array, middle+1, left, x);
//            } else {
//                return middle;
//            }
//        }
//        return -(left = 1);

    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 6, 1, 7, 4, 5};
        BinarySearchRecursive(arr, 7);
        System.out.println(BinarySearchRecursive(arr,5));
    }
}
