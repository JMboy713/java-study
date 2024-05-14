package exception.ex3.exception;

public class SendExceptionV3 extends NetworkClientExceptionV3{
    private final String address;

    public SendExceptionV3(String message, String address) {
        super(message);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
