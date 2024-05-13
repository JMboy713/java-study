package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV3 {
    private int outInstanceVar = 3;

    public Printer process(int paramVar) {
        final int localVar = 1; // 지역 변수는 스택 프레임이 종료되는 순간 함께 제거
        class LocalPrinter implements Printer {
            int value = 0;
            @Override
            public void print() {
                System.out.println("value: " + value);
                // 인스턴스는 지역 변수보다 오래 살아 남는다.
                System.out.println("localVar: " + localVar);
                System.out.println("paramVar: " + paramVar); // 매개변수에도 접근 가능

                System.out.println("outInstanceVar: " + outInstanceVar); // 외부 인스턴스 멤버에도 접근 가능
            }
        }
        LocalPrinter printer = new LocalPrinter();
        return printer;
    }


    public static void main(String[] args) {
        LocalOuterV3 outer = new LocalOuterV3();
        Printer printer = outer.process((2));
        printer.print();
        System.out.println("필드 확인");
        Field[] declaredFields = printer.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("declaredField = " + declaredField);
        }
    }
}
