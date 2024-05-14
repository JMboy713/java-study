package exception.ex2;

public class NetworkServiceV2_2 {
    public void sendMessage(String data){
        String address = "http://example.com";
        NetworklClientV2 client = new NetworklClientV2(address);
        client.initError(data);
        try {
            client.connect();
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류 코드]: "+e.getErrorCode()+" 메세지: "+e.getMessage());
            return; // send 안되게 반환.
        }
        try {
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류 코드]: "+e.getErrorCode()+" 메세지: "+e.getMessage());
            return; // send 안되게 반환.
        }
        client.disconnect();

    }
}
