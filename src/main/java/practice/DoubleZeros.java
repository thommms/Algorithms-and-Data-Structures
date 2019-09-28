package practice;
/**
 * Given an input array, and for any 0 in the array, double it and place it at next index
 */


import java.util.ArrayList;

public class DoubleZeros {
    public static void main(String[] args) {
        int[] array = {1, 0, 4, 0, 0, 0, 2, 9, 0};
        ArrayList<Integer> guy = new ArrayList<Integer>();

        for (int val : array) {
            if (val == 0) {
                guy.add(val);
                guy.add(val);
            } else {
                guy.add(val);
            }
        }
        System.out.println(guy);
    }
}
