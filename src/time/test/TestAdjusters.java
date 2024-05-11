package time.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TestAdjusters {
    public static void main(String[] args) {
        int year = 2024;
        int month = 1;


        LocalDate localDate = LocalDate.of(year, month, 1);
        LocalDateTime localDateTime = localDate.atStartOfDay();
        TemporalAdjuster temporalAdjuster = TemporalAdjusters.lastDayOfMonth();
        LocalDateTime with = localDateTime.with(temporalAdjuster);

        System.out.println("localDateTime = " + localDateTime.getDayOfWeek());
        System.out.println("LastDay = " + with.getDayOfWeek());
    }
}
