package practice;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Zip two arrays : given two arrays, zip both arrays by taking them in one after the other
 * example a=[1,3,5,2], b=[2,4,1] . This should return [1,2,3,4,5,1,2]
 */
public class ZipTwoArrays {
    public static void main(String[] args) {
        int[] a = {4, 5, 6, 3, 7, 2};
        int[] b = {5, 1, 7, 3, 1, 3, 2, 4, 2};
        ArrayList<Integer> join = new ArrayList<Integer>();
        int len = 0;
        if (a.length > b.length) {
            len = a.length;
        } else {
            len = b.length;
        }

//        int[] join = new int[len];

        for (int i = 0; i <= len; i++) {
            if (i < a.length) {
                join.add(a[i]);
//                join[i+1] = a[i];
            }
            if (i < b.length) {
                join.add(b[i]);
//                join[i+1] = b[i];

            }
        }
        System.out.println(join);
    }
}
