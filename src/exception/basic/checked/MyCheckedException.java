package exception.basic.checked;

// exception을 상속받은 예외는 체크 예외가 된다. ( runtime 아님)
public class MyCheckedException extends Exception{

    public MyCheckedException(String message) {
        super(message);
    }
}
