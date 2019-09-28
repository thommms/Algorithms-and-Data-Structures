package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Reverse a string without touching the special character. The special character should maintain same position
 */
public class ReverseStringSpecialCharacter {
    public static void main(String[] args) {
        char[] arr = {'a', 'z', ';','/', 'k', 'm', 'q', '.'};
        char[] revStrArr = new char[arr.length];
        int j = arr.length - 1;

        //convert the string to char array
        //create an empty reverse char array
        //check through the array for special characters and to reverse array
        //check through the array from behind for special characters and to reverse array
        //reverse the array with the special character in place.

        for (int i = 0; i <= j; ) {
            if (!Character.isAlphabetic(arr[i])) {
                revStrArr[i] = arr[i];
                i++;
            } else if (!Character.isAlphabetic(arr[j])) {
                revStrArr[j] = arr[j];
                j--;
            }
            else {
                revStrArr[j] = arr[i];
                revStrArr[i] = arr[j];
                j--;
                i++;
            }
        }
        System.out.println(revStrArr);
    }
}
