package time;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate localDate = LocalDate.of(2024, 5, 31);
        System.out.println("now = " + now);
        System.out.println("지정 날짜 = " + localDate);


        LocalDate localDate1 = localDate.plusDays(10);// 불변 객체
        System.out.println("10일 후 = " + localDate1);

    }
}
