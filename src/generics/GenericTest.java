package generics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class GenericTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList(); // object넣으면 모든 형이 들어갈 수 있다.
        // JDK1.5 부터 제네릭스가 추가됨. 제네릭스를 사용하면 컴파일러가 타입을 체크해준다. 제네릭스를 꼭 써주자.
        list.add(10);
        list.add(20);
        list.add(30);

        Integer i = (Integer) list.get(2); // object 를 integer로 바꾸는게 가능. 컴파일 OK
        // 실제로는 string 이 들어있다. 형변환 에러
        // 실행시 에러보다 컴파일 에러가 낫다. 컴파일 에러가 나면 실행조차 안되니까.
        Integer i1 = list.get(2); // 형변환 생략 가능. 컴파일러가 알아서 해준다.
        System.out.println(list);
        System.out.println(i1);

    }
}
