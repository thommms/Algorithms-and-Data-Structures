package practice;

/**
 * Write an algorithm for palindrome
 * e.g madam,
 */

public class Palindrome {
    public static void main(String[] args) {
        String input = "10801";

        //using char
        char[] arr = input.toCharArray();
        char[] result = new char[arr.length];
        for (int i = 0; i <= arr.length - 1; i++) {
            result[i] = arr[arr.length - 1 - i];
        }

        //using bytes
//        byte[] strByte = input.getBytes();
//        byte[] result = new byte[strByte.length];
//        for (int i = 0; i <= strByte.length-1; i++) {
//            result[i] = strByte[strByte.length - 1 - i];
//        }
        String ans = new String(result);
        System.out.println(ans.equals(input));
    }
}
