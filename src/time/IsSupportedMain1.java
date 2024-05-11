package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class IsSupportedMain1 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        boolean supported = now.isSupported(ChronoField.SECOND_OF_MINUTE);
        System.out.println("supported = " + supported);
        int i = now.get(ChronoField.SECOND_OF_MINUTE);// time 이 없어서 초 단위 조회 불가
        System.out.println("i = " + i);
    }
}
