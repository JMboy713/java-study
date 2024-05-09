package lang.clazz;

import java.lang.reflect.Field;

public class ClassMetaMain {
    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz = String.class;// 1. 클래스에서 조회
//        Class getClass = new String().getClass();// 2. 인스턴스에서 조회
//        Class.forName("java.lang.String");// 3. 클래스 이름으로 조회

        // 모든 필드 출력

        Field[] fields = clazz.getDeclaredFields();
        for (String arg : args) {
            
        }

    }
}
