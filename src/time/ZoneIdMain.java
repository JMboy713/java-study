package time;

import java.time.ZoneId;

public class ZoneIdMain {
    public static void main(String[] args) {
        for (String availableZoneId : ZoneId.getAvailableZoneIds()) { // 이용 가능한 zoneID  출력
            ZoneId zoneId = ZoneId.of(availableZoneId);// zoneId 객체 생성
            System.out.println(zoneId+"|"+zoneId.getRules());// zoneId 와 zoneId의 규칙 출력
        }
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println( "시스템 기본 시간대 = " + zoneId);

        ZoneId seoulZoneId = ZoneId.of("Asia/Seoul");
        System.out.println("서울 시간대 = " + seoulZoneId);
    }
}
