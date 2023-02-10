package by.yandr.myLearning.javaSE.examplesAndTasks.standardLibraries;

import java.util.Date;
import java.util.GregorianCalendar;

public class UseGregorCalendar {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(new Date());
        System.out.printf("Date: %d-%d-%d,day of Week: %d\nTime: %d.%d.%d", gc.get(gc.YEAR), gc.get(gc.MONTH)
                , gc.get(gc.DAY_OF_MONTH), gc.get(gc.DAY_OF_WEEK), gc.get(gc.HOUR_OF_DAY), gc.get(gc.MINUTE), gc.get(gc.SECOND));

        for (int year = 1990; year < 2023; year++) {
            if (gc.isLeapYear(year)) System.out.println(year + " - leap year");
        }
    }
}
