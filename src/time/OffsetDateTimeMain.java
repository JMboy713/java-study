package time;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class OffsetDateTimeMain {
    public static void main(String[] args) {
        OffsetDateTime now = OffsetDateTime.now();
        System.out.println("now = " + now);
        LocalDateTime localDateTime = LocalDateTime.of(2024, 5, 31, 12, 34, 56);
        System.out.println("지정 날짜 = " + localDateTime);
        OffsetDateTime offsetDateTime = OffsetDateTime.of(localDateTime, ZoneOffset.of("+09:00"));
        System.out.println("offsetDateTime = " + offsetDateTime);
    }
}
