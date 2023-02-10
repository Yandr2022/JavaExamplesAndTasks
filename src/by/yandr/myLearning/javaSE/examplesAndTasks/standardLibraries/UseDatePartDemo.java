package by.yandr.myLearning.javaSE.examplesAndTasks.standardLibraries;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class UseDatePartDemo {
    public static void main(String[] args) {
        DatePart dp = new DatePart(new Date());

        System.out.printf("Current year: %d\nCurrent month: %d\nCurrent day: %d\nCurrent time: %d-%d"
                , dp.getYear(), dp.getMonth(), dp.getDay(), dp.getHour(), dp.getMinute());

    }
}

class DatePart {
    private Date fromDate = null;
    SimpleDateFormat formatter = null;

    public DatePart(Date fromDate) {
        this.fromDate = fromDate;
        formatter = new SimpleDateFormat("EEE MMM dd hh:mm:ss yyyy", Locale.getDefault());
    }

    public int getDay() {
        formatter.applyPattern("d");
        return Integer.parseInt(formatter.format(fromDate));
    }

    public int getMonth() {
        formatter.applyPattern("M");
        return Integer.parseInt(formatter.format(fromDate));
    }

    public int getYear() {
        formatter.applyPattern("y");
        return Integer.parseInt(formatter.format(fromDate));
    }

    public int getHour() {
        formatter.applyPattern("h");
        return Integer.parseInt(formatter.format(fromDate));
    }

    public int getMinute() {
        formatter.applyPattern("m");
        return Integer.parseInt(formatter.format(fromDate));
    }


}
