package generic.ex1;

public class BoxMain1 {
    public static void main(String[] args) {
        IntegerBox integerBox = new IntegerBox();
        integerBox.set(10);// 오토 박싱
        System.out.println("IntegerBox: " + integerBox.get());

        StringBox stringBox = new StringBox();
        stringBox.set("Hello, World!");
        System.out.println("StringBox: " + stringBox.get());
    }
}
