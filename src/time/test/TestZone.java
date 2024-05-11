package time.test;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class TestZone {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2024, 1, 1, 9,0);

        ZonedDateTime seoul = ZonedDateTime.of(localDateTime, java.time.ZoneId.of("Asia/Seoul"));
        System.out.println("seoul = " + seoul);
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, java.time.ZoneId.of("Europe/London"));
        System.out.println("london = " + zonedDateTime);
        ZonedDateTime.of(localDateTime, java.time.ZoneId.of("America/New_York"));
        System.out.println("newyork = " + zonedDateTime);
    }
}
