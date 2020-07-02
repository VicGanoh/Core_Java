package java.datetimeAPI;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        System.out.println("Day of the year: " + calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println("Day of month: " +calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("Day of week: " + calendar.get(Calendar.DAY_OF_WEEK));

        //getting hour,minute and seconds
        System.out.println("========================");
        System.out.println("Hour, minute and second.");
        System.out.println("Hour:"+ calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minute: " + calendar.get(Calendar.MINUTE));
        System.out.println("Seconds: " + calendar.get(Calendar.SECOND));
        System.out.println("AM or PM: " + calendar.get(Calendar.AM_PM));

        //getting current date
        System.out.println("=====================");
        System.out.println("Current date.");
        System.out.println("Date: " + calendar.get(Calendar.DATE));
        System.out.println("Month: " + calendar.get(Calendar.MONTH));
        System.out.println("Year: " + calendar.get(Calendar.YEAR));

        //modifying the date and time
        System.out.println("Modified date.");
        calendar.add(Calendar.DATE, 4);
        calendar.add(Calendar.MONTH,1);
        calendar.add(Calendar.YEAR,-1);
        System.out.println("Date: " + calendar.get(Calendar.DATE));
        System.out.println("Month: " + calendar.get(Calendar.MONTH));
        System.out.println("Year: " + calendar.get(Calendar.YEAR));

    }
}
