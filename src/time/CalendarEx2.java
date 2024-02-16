package time;
import java.util.Calendar;
public class CalendarEx2 {
    public static void main(String[] args) {
        final String[] Day_Of_WEEK= {"월", "화", "수", "목", "금", "토", "일"};
        Calendar date1 = Calendar.getInstance();
        Calendar date2 = Calendar.getInstance();

        date1.set(2015, 7, 15); // 2015년 8월 15일
        System.out.println("date1은 " + toString(date1) + Day_Of_WEEK[date1.get(Calendar.DAY_OF_WEEK)-1] + "요일이고,");
        System.out.println("오늘(date2)은 " + toString(date2) + Day_Of_WEEK[date2.get(Calendar.DAY_OF_WEEK)-1] + "요일입니다.");


    }

    public static String toString(Calendar date) {
        return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH)+1) + "월 " + date.get(Calendar.DATE) + "일 ";
    }
}
