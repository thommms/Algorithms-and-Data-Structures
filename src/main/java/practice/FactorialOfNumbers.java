package practice;

import java.util.Scanner;

/**
 * Write an algorithm that calculates the factorial of any given number
 */

public class FactorialOfNumbers {
       public static int FirstFactorial(int num) {

            // code goes here
    /* Note: In Java the return type of a function and the
       parameter types being passed are defined, so this return
       call must match the return type of the function.
       You are free to modify the return type. */

           int i = 1,fact=1;
           for (i = 1; i <= num; i++) {
               fact = fact * i;
           }

            return fact;

        }

        public static void main (String[] args) {
            // keep this function call here
//            Scanner s = new Scanner(System.in);
//            System.out.print(FirstFactorial(5));
//            System.out.println(FirstFactorial(5));
            Scanner s = new Scanner(System.in);
            int arr = s.nextInt();
            System.out.print(FirstFactorial(arr));
//            System.out.println();
       }




}
