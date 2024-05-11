package time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class GetTimeMain {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2024, 5, 31, 12, 34, 56);
        System.out.println(dt.get(ChronoField.YEAR));
        System.out.println(dt.get(ChronoField.MONTH_OF_YEAR));
        System.out.println(dt.get(ChronoField.DAY_OF_MONTH));
        System.out.println(dt.get(ChronoField.HOUR_OF_DAY));
        System.out.println(dt.get(ChronoField.MINUTE_OF_HOUR));
        // 편의 메서드 사용
        System.out.println("편의 메서드 사용");
        System.out.println(dt.getYear());
        System.out.println(dt.getMonthValue());
        System.out.println(dt.getDayOfMonth());
        System.out.println(dt.getHour());
        System.out.println(dt.getMinute());

        // 편의 메서드에 없음
        System.out.println("편의 메서드에 없음");
        System.out.println("Minute of Day = " + dt.get(ChronoField.MINUTE_OF_DAY));

    }
}
