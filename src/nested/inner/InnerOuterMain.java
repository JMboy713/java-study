package nested.inner;

public class InnerOuterMain {
    public static void main(String[] args) {
        InnerOuter innerOuter = new InnerOuter();
        InnerOuter.Inner inner = innerOuter.new Inner(); // innerOuter 객체를 통해 Inner 객체 생성 가능
        inner.print();

        System.out.println("innerOuter.outInstanceValue = " + innerOuter.getClass());
    }
}
