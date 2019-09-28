package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Write an algorithm to sort 3 unequal arrays
 * e.g a=[1,4,2]  b=[3,7,5,10]  c=[8,6]
 * answer should be [1,2,3,4,5,6,7,8,10]
 */
public class ZipAndSort {
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
        int[] a = {1, 4, 2};
        int[] b = {3, 7, 5, 10};
        int[] c = {8, 6, 2, 8, 11, 15};
        List<Integer> join = new ArrayList<>();
        int len = 0;

        if (a.length > b.length && a.length > c.length) {
            len = a.length;
        } else if (b.length > a.length && b.length > c.length) {
            len = b.length;
        } else {
            len = c.length;
        }
        System.out.println(len);

        for (int i = 0; i < len; i++) {
            if (i < a.length) {
                join.add(a[i]);
            }
            if (i < b.length) {
                join.add(b[i]);
            }
            if (i < c.length) {
                join.add(c[i]);
            }
        }
        System.out.println(join);

        //convert arraylist to array
        int[] combined = join.stream().mapToInt(Integer::intValue).toArray();

        quicksort(combined);

//        //using bubble sort
//        boolean sorted = false;
//        int temp = 0;
//        while (!sorted) {
//            sorted = true;
//            for (int i = 0; i < combined.length - 1; i++) {
//                if (combined[i] > combined[i + 1]) {
//                    temp = combined[i];
//                    combined[i] = combined[i + 1];
//                    combined[i + 1] = temp;
//                    sorted = false;
//                }
//            }
//        }
        System.out.println(Arrays.toString(combined));
    }
}
