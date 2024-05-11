package time;

import java.time.LocalDate;
import java.time.Period;

public class PeriodMain {
    public static void main(String[] args) {
        Period period = Period.ofDays(10);
        System.out.println("period = " + period);
        LocalDate localDate = LocalDate.of(2030, 1, 1);
        LocalDate plus = localDate.plus(period);
        System.out.println("localDate = " + localDate);
        System.out.println("plus = " + plus);

        // 기간 차이
        LocalDate localDate1 = LocalDate.of(2023, 1, 1);
        LocalDate localDate2 = LocalDate.of(2024, 1, 1);
        Period period1 = Period.between(localDate1, localDate2);// 날짜 사이의 기간
        System.out.println("period1 = " + period1.getDays() + "일" + period1.getMonths() + "개월" + period1.getYears() + "년");

    }
}
