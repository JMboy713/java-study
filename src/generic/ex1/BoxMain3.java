package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<Integer>();
        integerBox.set(10);
        //integerBox.set("hi"); 컴파일 오류
        Integer i = integerBox.get();
        System.out.println("IntegerBox: " + i);

        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.set("Hello, World!");
        //stringBox.set(10); 컴파일 오류
        String str = stringBox.get();
        System.out.println("StringBox: " + str);


        // 원하는 모든 타입 사용 가능
        GenericBox<Double> doubleBox = new GenericBox<Double>();
        doubleBox.set(3.14);
        //doubleBox.set("hi"); 컴파일 오류
        Double d = doubleBox.get();
        System.out.println("DoubleBox: " + d);

        GenericBox<Integer> integerBox2 = new GenericBox<>();// 타입 추론 : 생성하는 제네릭 타입 생략 가능

    }
}
