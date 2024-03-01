package Lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");

        for (String s : list) {
            System.out.println(s);
        }

        list.stream().forEach(s -> System.out.println(s));// stream 안에 람다를 이용해 반복문 출력
    }
}
