package generic.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objMethod(i);

        // 타입 인자 ( Type argument )를 명시적으로 지정하지 않아도 된다. 명시적 전달
        Integer i1 = GenericMethod.<Integer>genericMethod(i);
        System.out.println("i1 = " + i1);
        Integer i2 = GenericMethod.<Integer>numberMethod(19);
        System.out.println("i2 = " + i2);

    }
}
