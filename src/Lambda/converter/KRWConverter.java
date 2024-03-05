package Lambda.converter;

public class KRWConverter implements Convertible {
    @Override
    public void convert(int USD) {
        System.out.println(USD+"달러 = " + USD * 1300 + "원 입니다.");
    }
}
