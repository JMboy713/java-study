package time;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingMain1 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2021, 1, 1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
        String format = ld.format(formatter);
        System.out.println("format = " + format);
        LocalDate now = LocalDate.now();
        String format1 = now.format(formatter);
        System.out.println("format1 = " + format1);
        // 파싱 : 문자를 날짜로
        LocalDate parse = LocalDate.parse("2021년 01월 01일", formatter);


    }
}
