package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class TestCalanderPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("년도를 입력하세요");
        int year = scanner.nextInt();
        System.out.println("월을 입력하세요");
        int month = scanner.nextInt();
        printCalendar(year, month);

    }

    public static void printCalendar(int year, int month) {
        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
        LocalDate firstDayOfNextMonth = firstDayOfMonth.plusMonths(1);
        int offsetWeekDays = firstDayOfMonth.getDayOfWeek().getValue() % 7;// 1일이 무슨 요일인지
        System.out.println("SU MO TU WE TH FR SA");
        for(int i=0;i<offsetWeekDays;i++){
            System.out.print("   ");//그만큼 띄우기
        }
        LocalDate dayIterator = firstDayOfMonth;
        while(dayIterator.isBefore(firstDayOfNextMonth)){
            int day = dayIterator.getDayOfMonth();
            System.out.printf("%3d",day);
            if(dayIterator.getDayOfWeek() == DayOfWeek.SATURDAY){
                System.out.println();
            }
            dayIterator = dayIterator.plusDays(1);
        }
    }
}
