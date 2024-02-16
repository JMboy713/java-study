package time;

import java.util.*;
import java.util.spi.CalendarNameProvider;


public class Calender {
    //Calender cal = new Calendar(); 캘린더는 추상클래스이기 때문에 메서드로 인스턴스를 생성해야한다.
//        Calendar cal = Calendar.getInstance();
    public static void main(String[] args) {
//        Calender cal = new GregorianCalendar();// 경우에 따라 이 부분을 변경
        Calendar today = Calendar.getInstance();
        System.out.println("이 해의 년도 : "+today.get(Calendar.YEAR));
        System.out.println("월 : "+today.get(Calendar.MONTH)); // 0~11 월 +1 해주어야함.
        System.out.println("이 해의 몇째 주 : "+today.get(Calendar.WEEK_OF_YEAR));
        System.out.println("이 달의 몇째 주 : "+today.get(Calendar.WEEK_OF_MONTH));




    }

}
