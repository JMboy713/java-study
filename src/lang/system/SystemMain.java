package lang.system;

import java.util.Arrays;
import java.util.Map;

public class SystemMain {
    public static void main(String[] args) {
        // 현재 시간 ( 밀리초)
        long l = System.currentTimeMillis();
        System.out.println(l);

        // 현재 시간 ( 나노초 )
        long l2 = System.nanoTime();
        System.out.println(l2);

        // 환경 변수를 읽는다. - 운영체제
        Map<String, String> getenv = System.getenv();
        System.out.println(getenv);

        // 시스템 속성을 읽는다. - java
         System.out.println("propterties= "+ System.getProperties());
        System.out.println("java.version= "+ System.getProperty("java.version"));

        // 배열을 고속으로 복사
        char[] originalArray = {'a', 'b', 'c', 'd', 'e'};
        char[] copiedArray = new char[5];
        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length); // 원본, 원본시작위치, 복사본, 복사본시작위치, 복사길이
        System.out.println("copiedArray = "+copiedArray);
        System.out.println("copiedArray = "+ Arrays.toString(copiedArray));

        //  프로그램 종료
        System.exit(0);


    }
}
