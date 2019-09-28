package sortingAndSearch;

//import java.util.Arrays;
import java.util.*;

public class MergeSort {

    public static void mergesort(int[] array) {
        mergesort(array,new int[array.length],0,array.length-1);
    }

    private static void mergesort(int[] array, int[] temp, int leftStart, int rightEnd) {
        if (leftStart >= rightEnd) {
            return;
        }
        int middle=(leftStart + rightEnd)/2;
        mergesort(array,temp,leftStart,middle);
        mergesort(array,temp,middle+1,rightEnd);
        mergehalves(array, temp, leftStart, rightEnd);
    }

    private static void mergehalves(int[] array, int[] temp, int leftStart, int rightEnd) {
        int leftEnd = (rightEnd + leftStart)/2;
        int rightStart = leftEnd + 1;
        int size = rightEnd - leftStart + 1;

        int leftIndex = leftStart;
        int rightIndex = rightStart;
        int index = leftStart;

        while (leftIndex <= leftEnd && rightIndex <= rightEnd) {
            if (array[leftIndex] <= array[rightIndex]) {
                temp[index]=array[leftIndex];
                leftIndex++;
            }
            else{
                temp[index] = array[rightIndex];
                rightIndex++;
            }
            index++;
        }
        System.arraycopy(array, leftIndex, temp, index,leftEnd-leftIndex+1);
        System.arraycopy(array, rightIndex, temp, index, rightEnd - rightIndex + 1);
        System.arraycopy(temp, leftStart, array, leftStart, size);
    }

    public static void main(String[] args) {
        //custom input
        int [] arr= {1,4,2,5,3,6,19,8,4,5,6,3,2,6};
        mergesort(arr);
        System.out.println(Arrays.toString(arr));

    }


}
