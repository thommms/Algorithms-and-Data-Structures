package practice;

import java.util.ArrayList;

/**
 * Print out all the prime numbers from 1 to N th number
 */
public class PrimeNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 8, 9, 10, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 29, 30, 31, 32, 33, 37};
        int N = 40;
        ArrayList<Integer> prime = new ArrayList<>();

        //for a given number N
//        for (int i = 2; i <= N; i++) {
//            int count = 0;
//            for (int j = 2; j < i; j++) {
//                if (i % j == 0) {
//                    count++;
//                    break;
//                }
//            }
//            if (count == 0 && i != 1) {
//                prime.add(i);
//            }
//
//        }

        //Alternatively for given array
        for (int i = 1; i <= arr.length-1; i++) {
            int count = 0;
            for (int j = 2; j < arr[i]; j++) {
                if (arr[i] % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0 && arr[i] != 1) {
                prime.add(arr[i]);
            }
        }
        System.out.println(prime + "with total of " + prime.size());


//        function primeArr(num) {
//                int[] guy = new int[arr.length];
//        for (int i = 1; i <= N; i++) {
//            if (i == 1 ) {
//
//            } else {
//                if(isPrime(i)) { arr.push(i);}
//            }
//        }
//        function isPrime(no) {
//        for(let i = 2; i < no; i++) {
//            if(no % i === 0) return false
//        }
//        return true;
//  }
//        return arr;
//}




    }
}
