package time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class ChangeTimeWithMain {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2018, 1, 1, 13, 30, 59);
        System.out.println("dt = " + dt);
        LocalDateTime with = dt.with(ChronoField.YEAR, 2020);
        System.out.println("with = " + with);
        LocalDateTime localDateTime = dt.withYear(2020);
        System.out.println("localDateTime = " + localDateTime);

        // TemporalAdjuster 사용
        LocalDateTime with1 = dt.with(TemporalAdjusters.next(DayOfWeek.MONDAY)); // 다음주 월요일
        System.out.println("with1 = " + with1);

        LocalDateTime with3 = dt.with(TemporalAdjusters.firstDayOfMonth());// 이번 달의 첫 번째 날
        LocalDateTime with2 = dt.with(TemporalAdjusters.lastDayOfMonth());// 이번 달의 마지막 날
        System.out.println("with2 = " + with2);
        System.out.println("with3 = " + with3);
    }
}
