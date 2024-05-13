package nested.anonymous;

import nested.local.Printer;

public class AnonymousOuter {
    private int outInstanceVar = 3;

    public void process(int paramVar) {
        int localVar = 1;

        Printer printer = new Printer() {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value: " + value);
                System.out.println("localVar: " + localVar);
                System.out.println("paramVar: " + paramVar); // 매개변수에도 접근 가능
                System.out.println("outInstanceVar: " + outInstanceVar); // 외부 인스턴스 멤버에도 접근 가능
            }

        };
        printer.print();
        System.out.println("printer.class = "+printer.getClass());
    }

    public static void main(String[] args) {
        AnonymousOuter outer = new AnonymousOuter();
        outer.process(7);
    }
}
