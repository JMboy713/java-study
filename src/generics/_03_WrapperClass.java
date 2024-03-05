package generics;

public class _03_WrapperClass {
    public static void main(String[] args) {
        // 래퍼 클래스 (Wrapper Class)
        // int double float char -> 객체로
        // Integer Double Float Character
        Integer i = 123; //  int  i = 123
        Double d = 1.0;
        Character c = 'A';

        System.out.println(i);
        System.out.println(d);
        System.out.println(c);

        System.out.println("--------------------");
        System.out.println(i.intValue());
        System.out.println(d.intValue()); // 실수를 int 로 바꿀 수 있다.
        System.out.println(c.charValue());

        String s = i.toString(); // 문자로 바꿀 수 있다.
        System.out.println(s);

    }
}
