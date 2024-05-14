package exception.ex4.exception;

public class NetworkClientV5 implements AutoCloseable{
    @Override
    public void close()  {
        System.out.println("close");
        disconnect();
    }

    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV5(String address) {
        this.address = address;
    }

    public void connect() {
        if (connectError) {
            throw new ConnectExceptionV4("Connection Error", address);
        }
        System.out.println(address + "서버 연결 성공");
    }

    public void send(String data) {
        if (sendError) {
            throw new SendExceptionV4("Send Error", address);
        }
        System.out.println(address + "서버에 데이터 전송" + data);
    }

    public void disconnect() {
        System.out.println(address + "서버 연결 해제");
    }

    public void initError(String data) {
        if (data.contains("error1")) {
            connectError = true;
        } else if (data.contains("error2")) {
            sendError = true;
        }
    }
}
