package generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.setValue(10);// 오토 박싱
        int value = (Integer)integerBox.getValue();
        System.out.println("IntegerBox: " + value);


        ObjectBox stringBox = new ObjectBox();
        stringBox.setValue("Hello, World!");
        String str = (String)stringBox.getValue();
        System.out.println("StringBox: " + str);

        integerBox.setValue("Hello, World!");
        integerBox.getValue();

    }
}
