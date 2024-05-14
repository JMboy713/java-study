package exception.ex2;


public class NetworklClientV2 {
    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworklClientV2(String address) {
        this.address = address;
    }

    public void connect() throws NetworkClientExceptionV2 {
        if(connectError) {
            throw new NetworkClientExceptionV2("connect error", address+"서버 연결 실패");
        }
        System.out.println(address+ "서버 연결 성공");
    }

    public void send(String data) throws NetworkClientExceptionV2 {
        if(sendError) {
            throw new NetworkClientExceptionV2("send error", address+"서버에 데이터 전송 실패 : " + data);
        }
        System.out.println(address + "서버에 데이터 전송 : " + data);
    }

    public void disconnect() {
        System.out.println(address + "서버 연결 해제");
    }

    public void initError(String data) {
        if(data.contains("error1")) {
            connectError = true;
        }
        if(data.contains("error2")) {
            sendError = true;
        }
    }
}
