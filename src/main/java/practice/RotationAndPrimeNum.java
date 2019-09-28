package practice;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Given an array Rotate it "x" number of times find the prime numbers and multiply by "y" and print out the odd
 * number in a resulting array
 * E.g: given array = [1, 2, 4, 5, 6], x = 3, y = 5
 * first, rotate it "x" times => [4, 5, 6, 1, 2]
 * then multiply prime numbers by "y" => [4, 25, 6, 1, 10]
 */
public class RotationAndPrimeNum {
    public static void main(String[] args) {
        int[] arr = {21, 19,31, 1, 2, 4, 5, 6, 7, 9, 13, 6};
        int x = 3;
        int y = 5;
        ArrayList<Integer> all = new ArrayList<>();

        for (int i = 0; i <= arr.length - 1; i++) {
            if (i >= x - 1 && i <= arr.length - 1) {
                all.add(arr[i]);
            } else {
                all.add(arr[i]);
            }
        }
        System.out.println(all);
        for (int i = 0; i < all.size(); i++) {
            int count = 0;
            for (int j = 2; j < all.get(i); j++) {
                if (all.get(i) % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0 && all.get(i) != 1) {
                System.out.println(all.get(i) + " is prime number");
                all.set(i, all.get(i) * y);
            }
        }
        System.out.println(all);
    }
}
