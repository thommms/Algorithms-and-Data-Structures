package practice;

import java.util.Arrays;

/**
 * Without using the sort function, print the missing number in the array
 * example; given a=[1,3,4,6,5] this should return 2
 */
public class MissingNumInArray {
    public static void main(String[] args) {
        int[] nums = {4, 8, 7, 6, 1, 3, 2, 9};
        int inc = 0;

        //sort the array
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    inc = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j]=inc;
                }
            }
        }
        System.out.println(Arrays.toString(nums));

        //find the missing value
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] - nums[i] > 1) {
                System.out.println(nums[i] + 1);
            }
        }


    }
}
