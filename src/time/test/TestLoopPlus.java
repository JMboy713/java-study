package time.test;

import java.time.LocalDate;

public class TestLoopPlus {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2024, 1, 1);

        for (int i = 1; i < 6; i++) {
            System.out.println("날짜 "+i+":" + localDate);
            LocalDate localDate1 = localDate.plusWeeks(2);
            localDate = localDate1;
        }
    }
}
