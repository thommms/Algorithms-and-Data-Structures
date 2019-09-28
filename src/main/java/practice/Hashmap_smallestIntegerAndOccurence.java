package practice;
/**
 * write a function that accepts an array of integers and returns the least repeated integers and the number of
 * times it occurred.
 * if two numbers satisfy the condition above, return the one with the lower value
 *
 * sample case: give array 1,1,1,1,2,2,3 the output should be an array [3,1]
* sample case: give array 1,1,1,5,5,2,2 the output should be an array [2,2]
 */

import java.util.*;

public class Hashmap_smallestIntegerAndOccurence {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        int[] array = {1, 3, 3, 5, 1, 6, 4, 1, 2, 2, 9, 3};

        //Add to the array to hashmap
        for (int i = 0; i < array.length; i++) {
            if (hashMap.containsKey(array[i])) {
                hashMap.put(array[i], hashMap.get(array[i]) + 1);
            } else {
                hashMap.put(array[i], 1);
            }
        }
        System.out.println(hashMap);

        //set minimum and maximum value
        int minval = -1;
        int minkey = -1;

        //loop through the hashmap and get the minimum key and value
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (minval == -1) {
                minval = entry.getValue();
                minkey = entry.getKey();
                continue;
            }
            if (minval > entry.getValue()) {
                minval = entry.getValue();
                minkey = entry.getKey();
            }
        }
        System.out.println("["+minkey + "," + minval+"]");

//        int min = array[0];
//        int max = array[0];
//
//        for (int val : hashMap.keySet()) {
////            min= (val < min) ? val: min ;
//            if (val < min) {
//                min = val;
//            }
//        }

    }
}
 