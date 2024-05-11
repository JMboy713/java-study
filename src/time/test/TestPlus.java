package time.test;

import java.time.LocalDateTime;

import static java.time.temporal.ChronoUnit.YEARS;

public class TestPlus {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2024, 1, 1, 0, 0, 0);
        System.out.println("기준 시각 :  " + ldt);
        LocalDateTime localDateTime = ldt.plusYears(1).plusMonths(2).plusDays(3).plusHours(4);
        System.out.println("1년 3일 4시간 2분 후 : " + localDateTime);


    }
}
