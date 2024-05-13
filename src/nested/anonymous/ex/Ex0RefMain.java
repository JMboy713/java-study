package nested.anonymous.ex;

public class Ex0RefMain {
    public static void helloJava(String language) {
        System.out.println("프로그램 시작");
        System.out.println("Hello "+language);
        System.out.println("프로그램 종료");
    }
    public static void main(String[] args) {
//        hello hello = new hello() {
//            @Override
//            public void printHello(String language) {
//                System.out.println("프로그램 시작");
//                System.out.println("Hello " + language);
//                System.out.println("프로그램 종료");
//            }
//        };
//        hello.printHello("Java");
//        hello.printHello("Spring");
        helloJava("Java");
        helloJava("Spring");
    }
}

