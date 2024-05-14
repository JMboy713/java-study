package generic.ex1;

public class RawTypeMain {
    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox<>(); // 생략시 Object 타입으로 처리
        //GenericBox<Object> integerBox = new GenericBox<>();


        integerBox.set(10);
        Integer i = (Integer) integerBox.get();
        System.out.println("result = " + i);


    }
}
