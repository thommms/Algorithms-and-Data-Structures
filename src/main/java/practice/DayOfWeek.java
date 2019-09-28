package practice;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;


/**
 * print the day of the week for any date
 */
public class DayOfWeek {
    public static String findDay(int month, int day, int year) {
        LocalDate localDate = LocalDate.of(year, month, day);
//        System.out.println(localDate.getDayOfWeek());
        return (localDate.getDayOfWeek().toString());
    }
    public static void main(String[] args) {
        System.out.println(findDay(04, 06, 2015));
    }
}
