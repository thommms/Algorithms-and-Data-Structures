package practice;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Write an algorithm to spell your name backwards or numbers
 */
public class ReverseString {
    public static void main(String[] args) {
        //for numbers
        int[] arr = {1, 2, 3, 4, 5};
        ArrayList<Integer> guy = new ArrayList<Integer>();

        //for array numbers
        for (int i = 0; i < arr.length - 1; i++) {
            guy.add(arr[arr.length - 1 - i]);
        }
        System.out.println(guy);

        //for strings
        String str = "thomas okonkwo";

        //using char
        char[] pardon = str.toCharArray();
        char[] result = new char[pardon.length];
        for (int i = 0; i <= pardon.length - 1; i++) {
            result[i] = pardon[pardon.length - 1 - i];
        }

        //using bytes
//        byte[] strToByte = str.getBytes();
//        byte[] result = new byte[strToByte.length];
//        for (int i = 0; i < strToByte.length; i++) {
//            result[i] = strToByte[strToByte.length - 1 - i];
//        }
        System.out.println(result);
//        System.out.println(new String(result));
    }
}
