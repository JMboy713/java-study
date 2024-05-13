package exception.basic.checked;

public class Client {
    public void call() throws MyCheckedException {// 예외를 밖으로 던짐
        throw new MyCheckedException("ex");// 예외를 발생
    }
}
