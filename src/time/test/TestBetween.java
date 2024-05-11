package time.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class TestBetween {
    public static void main(String[] args) {

        LocalDate startDate = LocalDate.of(2024, 1, 1);
        System.out.println("startDate = " + startDate);
        LocalDate endDate = LocalDate.of(2024, 11, 21);
        System.out.println("endDate = " + endDate);
        Period period = Period.between(startDate, endDate);
        System.out.println(period.getYears() + "년" + period.getMonths() + "개월" + period.getDays() + "일");



        long between = ChronoUnit.DAYS.between(startDate, endDate);
        System.out.println("디데이 :" + between+"일");
    }
}
