package JavaProblems.Introduction;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class DateAndTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();

        // first solution
//        Calendar calendar = Calendar.getInstance();
//        calendar.set(Calendar.MONTH, month);
//        calendar.set(Calendar.DAY_OF_MONTH, day);
//        calendar.set(Calendar.YEAR, year);
//
//        String dayOfWeek = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
//        System.out.println(dayOfWeek);


        // second solution - Hacker rank
        String[] day_of_week = {"SUNDAY", "MONDAY", "TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};

        Calendar calendar = Calendar.getInstance();
        calendar.set(year,month-1,day);
        int p = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println(day_of_week[p-1]);

    }
}
