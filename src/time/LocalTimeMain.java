package time;

import java.time.LocalTime;

public class LocalTimeMain {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        LocalTime localTime = LocalTime.of(12, 34, 56);
        System.out.println("now = " + now);
        System.out.println("지정 시간 = " + localTime);
        LocalTime localTime1 = localTime.plusHours(10);
        System.out.println("10시간 후 = " + localTime1);

    }
}
