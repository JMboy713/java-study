package exception.basic.unchecked;

public class UncheckedThrownMain {
    public static void main(String[] args) {
        Service service = new Service();
        service.callThrow();
        System.out.println("프로그램을 정상 종료합니다.");
    }
}
