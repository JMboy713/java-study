package Lambda;

@FunctionalInterface
public interface MyFunction {
    void run();
}

class LabmdaEx1{
    static void execute(MyFunction f) {
        f.run();
    }
    static MyFunction getMyFunction() { // 반환 타입이 MyFuntion인 메서드
        MyFunction f = () -> System.out.println("f3.run()");
        return f;
    }

    public static void main(String[] args) {
        // 람다식으로 myFuntion의 run()을 구현
        MyFunction f1 = () -> System.out.println("f1.run()");
        MyFunction f2 = new MyFunction() {
            public void run() {
                System.out.println("f2.run()");
            }
        };
        MyFunction f3 = getMyFunction();
        f1.run();
        f2.run();
        f3.run();
        execute(f1);
        execute(() -> System.out.println("run()"));
    }
}

