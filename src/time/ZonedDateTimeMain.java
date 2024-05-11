package time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeMain {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println( "now = " + now);

        LocalDateTime ldt = LocalDateTime.of(2024, 5, 31, 12, 34, 56);
        ZonedDateTime zdt = ZonedDateTime.of(ldt, ZoneId.of("Asia/Seoul"));// ZonedDateTime 객체 생성해당 시간대로
        System.out.println("지정 날짜 = " + zdt);

        ZonedDateTime zonedDateTime = ZonedDateTime.of(2024, 5, 31, 12, 34, 56, 0, ZoneId.of("Asia/Seoul"));
        System.out.println("zonedDateTime = " + zonedDateTime);
        ZonedDateTime utcZdt = zonedDateTime.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("utcZdt = " + utcZdt);

    }
}
