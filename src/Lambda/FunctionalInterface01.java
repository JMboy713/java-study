package Lambda;

import Lambda.converter.*;

public class FunctionalInterface01 {
    public static void main(String[] args) {
        // 함수형 인터페이스, 람다는 주로 매개변수안에 들어갈 값을 정의할 때 사용한다.
        // 함수형 인터페이스는 하나의 추상 메소드만 가지고 있는 인터페이스, @FunctionalInterface 어노테이션을 사용하여 함수형 인터페이스임을 명시할 수 있다.
        KRWConverter converter = new KRWConverter();
//        converter.convert(1);
        convertUSD((USD) -> System.out.println(USD+"달러 = " + USD * 1300 + "원 입니다."), 2);
        Convertible convertible = (USD) -> System.out.println(USD+"달러 = " + USD * 1300 + "원 입니다.");
        convertUSD(convertible, 3);

        // 전달값이 하나도 없다면?
        ConvertibleWithNoParams c1 = () -> System.out.println("1달러는 1300원");
        c1.convert(); // 람다 함수가 convert 메서드와 연결.

        // 두줄 이상 코드가 있다면?
        ConvertibleWithNoParams c2 =() -> {
            int USD = 5;
            int KRW = 1400;
            System.out.println(USD+"달러는 " + USD * KRW + "원 입니다.");

        };
        c2.convert();

        // 전달값이 2개인 경우?
        ConvertibleWithTwoParams c3 = (d,k) -> {
            System.out.println(d+"달러는 " + d * k + "원 입니다.");
        };
        c3.convert(6, 1400);

        // 반환 값이 있는 경우
        ConvertibleWithReturn c4 = (d,k) -> {
            return d * k;
        };
        int result = c4.convert(7, 1400);
        System.out.println(result);
    }

    public static void convertUSD(Convertible converter, int USD){
        converter.convert(USD);
    }






}
