package exception.basic.checked;

public class CheckedCatchMain {
    public static void main(String[] args) {
        Service service = new Service();
        service.callCatch();
        System.out.println("프로그램을 정상 종료합니다.");
    }
}
