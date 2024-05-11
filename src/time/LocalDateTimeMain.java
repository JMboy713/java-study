package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime localDateTime = LocalDateTime.of(2024, 5, 31, 12, 34, 56);
        System.out.println("now = " + now);
        System.out.println("지정 날짜 = " + localDateTime);

        LocalDate localDate = localDateTime.toLocalDate();
        System.out.println("localDate = " + localDate);
        LocalTime localTime = localDateTime.toLocalTime();
        System.out.println("localTime = " + localTime);

        LocalDateTime localDateTime1 = LocalDateTime.of(localDate, localTime);
        System.out.println("localDateTime1 = " + localDateTime1);
        LocalDateTime localDateTime2 = localDateTime.plusDays(1000);
        System.out.println("1000일 후 = " + localDateTime2);

        System.out.println("현재 시간이 지정 잘짜 시간 보다 이전인가?"+now.isBefore(localDateTime));
    }
}
