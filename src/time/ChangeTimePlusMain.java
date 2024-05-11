package time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChangeTimePlusMain {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2018, 1, 1, 13, 30, 59);
        System.out.println("dt = " + dt);
        LocalDateTime plus = dt.plus(10, ChronoUnit.DAYS);
        System.out.println("plus = " + plus);
        LocalDateTime plusMonth = dt.minus(10, ChronoUnit.MONTHS);
        System.out.println("plusMonth = " + plusMonth);

    }
}
