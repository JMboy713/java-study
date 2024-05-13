package exception.basic.checked;

public class CheckedThrowMain {
    public static void main(String[] args) throws MyCheckedException {
        Service service = new Service();
        service.catchThrow();


        System.out.println("프로그램을 정상 종료합니다.");
    }

}
