package model.support.report;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeFormat {

    public static String getDateInReportFormat(){
        SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss");
        Date now = new Date();
        return formatDate.format(now);
    }

    public static String getDateInScreenshotFormat(){
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy_hh'h'mm'm's's'");
        LocalDateTime localDate = LocalDateTime.now();
        return dateFormatter.format(localDate);
    }
}
